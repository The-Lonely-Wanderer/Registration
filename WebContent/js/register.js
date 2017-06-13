/**
 * 
 */
function registerusernamef() {
	var username = document.getElementById("registerusername").value.trim();
	var usernamespan = document.getElementById("registersp1");
	if (username.length == 0) {
		usernamespan.style.display = "block";
	} else {
		usernamespan.style.display = "none";
	}
}
function registerpasswordf() {
	var password = document.getElementById("registerpassword").value.trim();
	var passwordspan = document.getElementById("registersp");
	if (password.length == 0) {
		passwordspan.style.display = "block";
	} else {
		passwordspan.style.display = "none";
	}
}
function registerrepasswordf() {
	var password = document.getElementById("registerrepassword").value.trim();
	var passwordspan = document.getElementById("registersp2");
	if (password.length == 0) {
		passwordspan.style.display = "block";
	} else {
		passwordspan.style.display = "none";
	}
}
function registerbuttonsub() {
	var username = document.getElementById("registerusername").value.trim();
	var password = document.getElementById("registerpassword").value.trim();
	var form = document.getElementById("registerfrom");
	var but = document.getElementById("register");
	if (username.length == 0 || password.length == 0) {
		alert("用户名或密码不能为零");
	} else {
		form.submit();
	}
}
function backa() {
	window.location = "index.jsp";
}
