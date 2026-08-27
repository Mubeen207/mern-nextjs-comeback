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

    
};
