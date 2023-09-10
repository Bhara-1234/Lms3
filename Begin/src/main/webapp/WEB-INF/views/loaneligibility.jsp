<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Check Loan Eligibility</h3>
<label>Required Loan Amount:</label><input type="text" name="lnap_amount"  id="amount">
<label>Annual Income:</label><input type="text" name= "anualincome"  onchange="calculate()" id="lpa">
<label>Disposable Account:</label><input type="text" name="disposable amount"  id="disposable" readonly>
<label>Cibil Score:</label><input type="text" name="cibil" id="cibil"  required>
<button  onclick="check()">check</button>
<form action="">
<label>Total Amount:</label><input type="text" id="total">
<label>Repay Within Years:</label><input type="text" id="years">
<label>Interest Amount:</label><input type="text" id="interest">
</form>
<script>
function calculate(){
	var annual= parseFloat(document.getElementById("lpa").value);

	var dis= (annual*(0.3))/12;
	 document.getElementById("disposable").value=dis;
	
	
}
function  check(){
	var loan =document.getElementById("amount").value;
	var dis=document.getElementById("disposable").value;
	var time = (loan/dis)/12;
	var interest= (loan*time*0.6)/100;
	var totalamount = loan+interest;
	var months = totalamount/(dis);
	document.getElementById("years").value=time;
	document.getElementById("total").value=totalamount;
	document.getElementById("interest").value=interest;
	
}

</script>



</body>
</html>