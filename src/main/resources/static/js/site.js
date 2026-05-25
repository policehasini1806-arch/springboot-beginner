console.log("Hello from JS");

var users = [
    {"name" : "John", "gender" : "Male", "img" : "john_img.png"},
    {"name" : "Jane", "gender" : "Female", "img" : "jane_img.png"}
];

var currentUserIndex = 0;

function toggleCard(){
    currentUserIndex =(currentUserIndex + 1) % 2;
    var user = users[currentUserIndex];

    // DOM Manipulation
    document.getElementById("userImage").src = user.img;
    document.getElementById("userGender").innerHTML = user.gender;
    document.getElementById("userName").innerHTML = user.name;
}