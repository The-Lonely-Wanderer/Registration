/**
 * 
 */

function usernamef() {
	var username = document.getElementById("username").value.trim();
	var usernamespan = document.getElementById("sp1");
	console.log(username);
	console.log(usernamespan);
	if (username.length == 0) {
		usernamespan.style.display = "block";
	} else {
		usernamespan.style.display = "none";
	}
}
function passwordf() {
	var password = document.getElementById("password").value.trim();
	var passwordspan = document.getElementById("sp");
	console.log(password);
	console.log(passwordspan);
	if (password.length == 0) {
		passwordspan.style.display = "block";
	} else {
		passwordspan.style.display = "none";
	}
}
function buttonsub() {
	var username = document.getElementById("username").value.trim();
	var password = document.getElementById("password").value.trim();
	var form = document.getElementById("loginfrom");
	var but = document.getElementById("login");
	if (username.length == 0 || password.length == 0) {
		alert("用户名或密码不能为零");
	} else {
		form.submit();
	}
}
function isbaa() {
	window.location = "login.jsp";
}
