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




function  validateRegistrationForm(){
	
	
 var fName =	document.getElementById("FName").value;
	
 if (fName == null || fName == "") {
		alert("Please enter the userName");
		return false;
	}
 else{
	 
	 if(fName.length < 4){
			alert("Please enter atleast 4 character");
			return false;
 
	 }
 }

 
 
	
}
