var userArray = [
    {"name" : "John Doe", "gender" : "Male", "img" : "john_img.png"},
    {"name" : "Jane Doe", "gender" : "Female", "img" : "jane_img.png"}
];

var currentUserIndex = 1;

function toggleUser(){
    currentUserIndex =(currentUserIndex + 1) % 2;
    var nextUser = userArray[currentUserIndex];
    displayUser(nextUser);
}
function displayUser(user){
    //console.log(user);
    document.getElementById("userName").textContent = user.name;
    document.getElementById("userGender").textContent = user.gender;
    document.getElementById("userImage").src = user.img;
}