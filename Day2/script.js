let inputValue = document.getElementById("inputFeild");
let inputButton = document.getElementById("inputButton");
let warrnigElement = document.getElementById("warrnig");
let allTasksElement = document.getElementById("allTasks");
let tasks = [];
let isEditId = "";
let addTask = () => {
  if (inputValue.value === "") {
    warrnigElement.innerHTML = "Please Enter Task";
    return;
  }
  warrnigElement.innerHTML = "";
  if (isEditId !== "") {
    inputButton.innerHTML = "Add";
    tasks = tasks.map((item) => {
      if (isEditId === item.id) {
        return { ...item, task: inputValue.value };
      }
    });
  }
  tasks.push({
    task: inputValue.value,
    id: idgenerator(),
  });
  inputValue.value = "";
  pushTasks(tasks);
};

let pushTasks = (tasks) => {
  allTasksElement.innerHTML = tasks.map((task) => {
    return `<div id="${task.id}">
  <p>${task.task}</p>
  <button onClick="deleteTask('${task.id}')">Delete</button>
  <button onClick="editTask('${task.id}')">Edit</button>
</div>`;
  });
};
let deleteTask = (id) => {
  let updatedTasks = tasks.filter((task) => task.id !== id);
  console.log(tasks);
  tasks = updatedTasks;
  pushTasks(tasks);
};

let editTask = (id) => {
  isEditId = id;
  inputButton.innerHTML = "Update";
  tasks.map((item) => {
    if (item.id === id) {
      return (inputValue.value = item.task);
    }
  });
};

let idgenerator = () => {
  const chars =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
  let id = "";
  for (let i = 0; i < 6; i++) {
    let rendomIndex = Math.floor(Math.random() * chars.length);
    id += chars[rendomIndex];
  }
  return id;
};
