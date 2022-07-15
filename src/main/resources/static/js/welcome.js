//let userInput = window.prompt("What's your name?")
//
//console.log(userInput)
//
//var user = {
//	"username" : userInput.value
//}
//
//console.log(user)
//

var user = sessionStorage.getItem("user")
if (user == null) {
	let username = window.prompt("What's your name?", "New User")
	while (username === '' || username == null) {
		username = prompt("What's your name", "New User")
	}
	
	
	
}