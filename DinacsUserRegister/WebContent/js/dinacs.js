/**
 * 
 */

function userValidate(){
	alert("hi");
	var userName = document.getElementsByName("Uname").value();
	var passWord = document.getElementsByName("pass").value();
	
	alert(userName);
	alert(passWord);

	
	if(userName==null || userName==" "){
		alert("Please enter the userName");
		//alert("Please enter the passWord");
			
	}
	
	if(passWord==null || passWord==" "){
		alert("Please enter the passWord");
			
	}
	
	
}
