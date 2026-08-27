let inputValue = document.getElementById("inputFeild");
let inputButton = document.getElementById("inputButton");
let tasks = [];
const chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
let addInput = () => {
  tasks.push({
    task: inputValue.value,
    id: idgenerator(),
  });
  console.log(tasks);
};

let idgenerator = () => {
  let id = "";
  for (let i = 0; i < 6; i++) {
    let rendomIndex = Math.floor(Math.random * chars.lemght);
    id += chars[rendomIndex];
  }
  return id;
};

console.log(idgenerator());
