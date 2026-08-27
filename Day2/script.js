let inputValue = document.getElementById("inputFeild");
let inputButton = document.getElementById("inputButton");
let warrnigElement = document.getElemantById("warrnig");
let tasks = [];
let addInput = () => {
  if (inputValue.value === "") {
    warrnigElement.value = "Please Enter Task";
    return;
  }
  tasks.push({
    task: inputValue.value,
    id: idgenerator(),
  });
  inputValue.value = "";
  console.log(tasks);
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
