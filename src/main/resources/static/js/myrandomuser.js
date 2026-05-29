function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}
console.log(getRandomInt(1, 2)); // Returns 1 or 2

function displayUser(user){
    document.getElementById("userName").textContent = user.name;
    document.getElementById("userImage").src = user.image;
    document.getElementById("userGender").textContent = user.gender;
    document.getElementById("userId").textContent = user.id;
}
function getAndDisplayNextRandomUser(){
    fetch("/api/users")
    .then(function(res){
        return res.json();
    })
    .then(function(data){
        var randomIndex = getRandomInt(0, data.length - 1);
        var userData = data[randomIndex];   
        displayUser(userData);
    })
    .catch(function(err){
        console.log("ERROR " +err);
    });
}