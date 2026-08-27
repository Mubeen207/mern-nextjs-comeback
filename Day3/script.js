const form = document.getElementById("transactionForm");
const titleInput = document.getElementById("titleInput");
const amountInput = document.getElementById("amountInput");
const typeInput = document.getElementById("typeInput");
const categoryInput = document.getElementById("categoryInput");
const submitButton = document.getElementById("submitButton");
const warning = document.getElementById("warning");
const transactionList = document.getElementById("transactionList");
const searchInput = document.getElementById("searchInput");
const typeFilter = document.getElementById("typeFilter");
const categoryFilter = document.getElementById("categoryFilter");
const monthFilter = document.getElementById("monthFilter");
const clearButton = document.getElementById("clearButton");
const transactionCount = document.getElementById("transactionCount");
const modal = document.getElementById("confirmModal");
const transactionsKey = "ledger-transactions";
const budgetKey = "ledger-budget";
let transactions = loadTransactions();
let editId = null;

document.getElementById("todayLabel").textContent = new Intl.DateTimeFormat("en-US", { weekday: "long", month: "short", day: "numeric" }).format(new Date());
document.getElementById("budgetInput").value = localStorage.getItem(budgetKey) || "";

function loadTransactions() {
  try {
    const data = JSON.parse(localStorage.getItem(transactionsKey));
    return Array.isArray(data) ? data : [];
  } catch { return []; }
}
function saveTransactions() { localStorage.setItem(transactionsKey, JSON.stringify(transactions)); }
function formatMoney(value) { return `Rs ${value.toLocaleString("en-PK", { maximumFractionDigits: 2 })}`; }
function formatDate(value) { return new Intl.DateTimeFormat("en-US", { dateStyle: "medium", timeStyle: "short" }).format(new Date(value)); }
function monthMatches(item) { return !monthFilter.value || item.date.slice(0, 7) === monthFilter.value; }
function scopedTransactions() { return transactions.filter(monthMatches); }

function updateSummary() {
  const scoped = scopedTransactions();
  const income = scoped.filter((item) => item.type === "income").reduce((sum, item) => sum + item.amount, 0);
  const expense = scoped.filter((item) => item.type === "expense").reduce((sum, item) => sum + item.amount, 0);
  document.getElementById("income").textContent = formatMoney(income);
  document.getElementById("expense").textContent = formatMoney(expense);
  document.getElementById("balance").textContent = formatMoney(income - expense);
  document.querySelector(".balance-card").classList.toggle("negative", income - expense < 0);
  updateAnalytics(scoped, income, expense);
  updateBudget(expense);
}
function updateAnalytics(scoped, income, expense) {
  const max = Math.max(income, expense, 1);
  document.getElementById("barChart").innerHTML = `<div class="chart-column"><div class="bar income-bar" style="height:${Math.max(income / max * 100, 3)}%"><span>${formatMoney(income)}</span></div><small>Income</small></div><div class="chart-column"><div class="bar expense-bar" style="height:${Math.max(expense / max * 100, 3)}%"><span>${formatMoney(expense)}</span></div><small>Expense</small></div>`;
  const categories = scoped.filter((item) => item.type === "expense").reduce((result, item) => { result[item.category] = (result[item.category] || 0) + item.amount; return result; }, {});
  const ordered = Object.entries(categories).sort((a, b) => b[1] - a[1]);
  const totalExpense = expense || 1;
  document.getElementById("categoryBreakdown").innerHTML = ordered.length ? ordered.map(([category, value]) => `<div class="category-row"><span>${category}</span><div class="progress-track"><i style="width:${value / totalExpense * 100}%"></i></div><strong>${Math.round(value / totalExpense * 100)}%</strong></div>`).join("") : '<span class="analytics-empty">Add expenses to see category breakdown.</span>';
}
function updateBudget(expense) {
  const budget = Number(document.getElementById("budgetInput").value);
  const status = document.getElementById("budgetStatus");
  status.classList.toggle("over-budget", budget > 0 && expense > budget);
  status.textContent = budget > 0 ? (expense > budget ? `Budget exceeded by ${formatMoney(expense - budget)}.` : `${formatMoney(budget - expense)} remaining this month.`) : "Set a limit to keep spending in check.";
}
function renderTransactions() {
  const searchTerm = searchInput.value.trim().toLowerCase();
  const visible = transactions.filter((item) => monthMatches(item) && item.title.toLowerCase().includes(searchTerm) && (typeFilter.value === "all" || item.type === typeFilter.value) && (categoryFilter.value === "all" || item.category === categoryFilter.value));
  transactionCount.textContent = visible.length;
  clearButton.hidden = transactions.length === 0;
  transactionList.innerHTML = "";
  if (!visible.length) { transactionList.innerHTML = `<div class="empty-state"><strong>${transactions.length ? "No matching transactions" : "Your ledger is clear"}</strong>${transactions.length ? "Try a different search or filter." : "Add your first entry to see it here."}</div>`; return; }
  visible.forEach((item) => {
    const row = document.createElement("article");
    row.className = `transaction ${item.type}`;
    row.innerHTML = `<div><p class="transaction-title"></p><span class="transaction-meta">${item.category} · ${formatDate(item.date)}</span></div><strong class="transaction-amount">${item.type === "income" ? "+" : "-"} ${formatMoney(item.amount)}</strong><div class="actions"><button class="action-button" data-action="edit" data-id="${item.id}" type="button">Edit</button><button class="action-button delete" data-action="delete" data-id="${item.id}" type="button">Delete</button></div>`;
    row.querySelector(".transaction-title").textContent = item.title;
    transactionList.appendChild(row);
  });
}
function resetForm() { editId = null; form.reset(); typeInput.value = "expense"; categoryInput.value = "Salary"; submitButton.innerHTML = "Add transaction <span>↗</span>"; warning.textContent = ""; }

form.addEventListener("submit", (event) => {
  event.preventDefault();
  const title = titleInput.value.trim();
  const amount = Number(amountInput.value);
  if (!title || !Number.isFinite(amount) || amount <= 0) { warning.textContent = "Please enter a description and a valid amount."; return; }
  const data = { title, amount, type: typeInput.value, category: categoryInput.value };
  if (editId) transactions = transactions.map((item) => item.id === editId ? { ...item, ...data } : item);
  else transactions.unshift({ ...data, id: crypto.randomUUID(), date: new Date().toISOString() });
  saveTransactions(); resetForm(); updateSummary(); renderTransactions();
});
transactionList.addEventListener("click", (event) => {
  const button = event.target.closest("button[data-action]");
  if (!button) return;
  const item = transactions.find((transaction) => transaction.id === button.dataset.id);
  if (!item) return;
  if (button.dataset.action === "delete") { transactions = transactions.filter((transaction) => transaction.id !== item.id); if (editId === item.id) resetForm(); saveTransactions(); updateSummary(); renderTransactions(); }
  else { editId = item.id; titleInput.value = item.title; amountInput.value = item.amount; typeInput.value = item.type; categoryInput.value = item.category; submitButton.innerHTML = "Update transaction <span>↗</span>"; titleInput.focus(); }
});
[searchInput, typeFilter, categoryFilter, monthFilter].forEach((control) => control.addEventListener("input", () => { updateSummary(); renderTransactions(); }));
document.getElementById("saveBudgetButton").addEventListener("click", () => { const value = Number(document.getElementById("budgetInput").value); if (value < 0 || !Number.isFinite(value)) return; localStorage.setItem(budgetKey, value || ""); updateBudget(scopedTransactions().filter((item) => item.type === "expense").reduce((sum, item) => sum + item.amount, 0)); });
clearButton.addEventListener("click", () => { modal.hidden = false; document.getElementById("confirmClear").focus(); });
document.getElementById("cancelClear").addEventListener("click", () => { modal.hidden = true; });
document.addEventListener("keydown", (event) => { if (!modal.hidden && (event.key === "Escape" || event.key === "Backspace")) { event.preventDefault(); modal.hidden = true; } });
document.getElementById("confirmClear").addEventListener("click", () => { transactions = []; resetForm(); saveTransactions(); modal.hidden = true; updateSummary(); renderTransactions(); });
document.getElementById("exportButton").addEventListener("click", () => { const blob = new Blob([JSON.stringify(transactions, null, 2)], { type: "application/json" }); const link = document.createElement("a"); link.href = URL.createObjectURL(blob); link.download = `ledger-backup-${new Date().toISOString().slice(0, 10)}.json`; link.hidden = true; document.body.appendChild(link); link.click(); link.remove(); URL.revokeObjectURL(link.href); });
document.getElementById("importInput").addEventListener("change", (event) => { const file = event.target.files[0]; if (!file) return; const reader = new FileReader(); reader.onload = () => { try { const imported = JSON.parse(reader.result); if (!Array.isArray(imported) || imported.some((item) => !item.id || !item.title || !Number.isFinite(Number(item.amount)) || !["income", "expense"].includes(item.type))) throw new Error(); transactions = imported.map((item) => ({ ...item, amount: Number(item.amount) })); saveTransactions(); updateSummary(); renderTransactions(); warning.textContent = "Backup restored successfully."; } catch { warning.textContent = "This backup file is not valid."; } event.target.value = ""; }; reader.readAsText(file); });
if ("serviceWorker" in navigator && (location.protocol === "https:" || location.hostname === "localhost")) navigator.serviceWorker.register("sw.js").catch(() => {});
updateSummary();
renderTransactions();
