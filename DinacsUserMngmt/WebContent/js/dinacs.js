/**
 * 
 */

function userValidate() {
	var userName = document.getElementById("Uname").value;
	var passWord = document.getElementById("pass").value;

	if (userName == null || userName == "") {
		alert("Please enter the userName");
		return false;
	}

	if (passWord == null || passWord == "") {
		alert("Please enter the passWord");
		return false;

	}

}
