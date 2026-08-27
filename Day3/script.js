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
const clearButton = document.getElementById("clearButton");
const transactionCount = document.getElementById("transactionCount");
const transactionsKey = "ledger-transactions";
let transactions = loadTransactions();
let editId = null;

document.getElementById("todayLabel").textContent = new Intl.DateTimeFormat("en-US", { weekday: "long", month: "short", day: "numeric" }).format(new Date());

function loadTransactions() {
  try { return JSON.parse(localStorage.getItem(transactionsKey)) || []; } catch { return []; }
}

function saveTransactions() { localStorage.setItem(transactionsKey, JSON.stringify(transactions)); }
function formatMoney(value) { return `Rs ${value.toLocaleString("en-PK", { maximumFractionDigits: 2 })}`; }
function formatDate(value) { return new Intl.DateTimeFormat("en-US", { dateStyle: "medium", timeStyle: "short" }).format(new Date(value)); }

function updateSummary() {
  const income = transactions.filter((item) => item.type === "income").reduce((sum, item) => sum + item.amount, 0);
  const expense = transactions.filter((item) => item.type === "expense").reduce((sum, item) => sum + item.amount, 0);
  const balance = income - expense;
  document.getElementById("income").textContent = formatMoney(income);
  document.getElementById("expense").textContent = formatMoney(expense);
  document.getElementById("balance").textContent = formatMoney(balance);
  document.querySelector(".balance-card").classList.toggle("negative", balance < 0);
}

function renderTransactions() {
  const searchTerm = searchInput.value.trim().toLowerCase();
  const visible = transactions.filter((item) => item.title.toLowerCase().includes(searchTerm) && (typeFilter.value === "all" || item.type === typeFilter.value) && (categoryFilter.value === "all" || item.category === categoryFilter.value));
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
  if (!title || !amount || amount < 0) { warning.textContent = "Please enter a description and a valid amount."; return; }
  const data = { title, amount, type: typeInput.value, category: categoryInput.value };
  if (editId) transactions = transactions.map((item) => item.id === editId ? { ...item, ...data } : item);
  else transactions.unshift({ ...data, id: crypto.randomUUID(), date: new Date().toISOString() });
  saveTransactions(); resetForm(); updateSummary(); renderTransactions();
});

transactionList.addEventListener("click", (event) => {
  const button = event.target.closest("button[data-action]"); if (!button) return;
  const item = transactions.find((transaction) => transaction.id === button.dataset.id); if (!item) return;
  if (button.dataset.action === "delete") { transactions = transactions.filter((transaction) => transaction.id !== item.id); if (editId === item.id) resetForm(); }
  else { editId = item.id; titleInput.value = item.title; amountInput.value = item.amount; typeInput.value = item.type; categoryInput.value = item.category; submitButton.innerHTML = "Update transaction <span>↗</span>"; titleInput.focus(); }
  saveTransactions(); updateSummary(); renderTransactions();
});

[searchInput, typeFilter, categoryFilter].forEach((control) => control.addEventListener("input", renderTransactions));
clearButton.addEventListener("click", () => { transactions = []; resetForm(); saveTransactions(); updateSummary(); renderTransactions(); });
updateSummary(); renderTransactions();