<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loanapplication" method="get">
<!-- int lnap_id;
	int lnap_cust_id;
	Date lnap_apdate;
	int lnap_lnty_id;
	int lnap_amount;
	int lnap_emi_range_from;
	int lnap_emi_range_to;
	int lnap_noy;
	int lnap_nom_requested;
	int lnap_cibil_Score;
	String lnap_status;
	String lnap_conclusion_remarks;
	int lnap_processed_user;
	Date lnap_processed_Date; -->

<label>Applied Date:</label><input type="date" name= "lnap_apdate">
<label>Customer Id:</label><input type="text" name="lnap_cust_id" >
 <label>LoanType:</label><input type="text" name= "lnap_lnty_id">
<label>Loan Amount:</label><input type="text" name= "lnap_amount">
<label>Emi Range From:</label><input type="text" name= "lnap_emi_range_from">
<label>Emi Range To:</label><input type="text" name= "lnap_emi_range_to">
<label>No.Of.Years:</label><input type="text" name="lnap_noy">
<label>NomineeId:</label><input type="text" name="lnap_nom_requested">
<label>CibilScore:</label><input type="text" name="lnap_cibil_Score">
<label>Status:</label><input type="text" name="lnap_status">
<label>Remarks:</label><input type="text" name="lnap_conclusion_remarks">
<label>ProcessedUser:</label><input type="text" name="lnap_processed_user"> 
<label>ProcessedDate:</label><input type="date" name="lnap_processed_Date">
<input type="submit">




</form>
</body>
</html>