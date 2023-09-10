<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.LoanApplication"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%LoanApplication lc=(LoanApplication)request.getAttribute("loanapplication"); %>
<h1>EditAppplicants</h1>
<form action="update">
<label>Applied Date:</label><input type="date" name= "lnap_apdate" value="<%=lc.getLnap_apdate() %>" readonly>
<label>Customer Id:</label><input type="text" name="lnap_cust_id" value="<%=lc.getLnap_cust_id()%>" readonly>
 <label>LoanType:</label><input type="text" name= "lnap_lnty_id" value="<%=lc.getLnap_lnty_id()%>" readonly>
<label>Loan Amount:</label><input type="text" name= "lnap_amount" value="<%=lc.getLnap_amount()%>" readonly>
<label>Emi Range From:</label><input type="text" name= "lnap_emi_range_from" value="<%=lc.getLnap_emi_range_from()%>" readonly>
<label>Emi Range To:</label><input type="text" name= "lnap_emi_range_to" value="<%=lc.getLnap_emi_range_to()%>" readonly>
<label>No.Of.Years:</label><input type="text" name="lnap_noy" value="<%=lc.getLnap_noy()%>" readonly>
<label>NomineeId:</label><input type="text" name="lnap_nom_requested" value="<%=lc.getLnap_nom_requested()%>" readonly>
<label>CibilScore:</label><input type="text" name="lnap_cibil_Score" value="<%=lc.getLnap_cibil_Score()%>" readonly>
<label>Status:</label><input type="text" name="lnap_status" value="<%=lc.getLnap_status()%>" readonly>
<label>Remarks:</label><input type="text" name="lnap_conclusion_remarks" value="<%=lc.getLnap_conclusion_remarks()%>" readonly>
<label>ProcessedUser:</label><input type="text" name="lnap_processed_user" value="<%=lc.getLnap_processed_user()%>" readonly> 
<label>ProcessedDate:</label><input type="date" name="lnap_processed_Date" value="<%=lc.getLnap_processed_Date()%>"  readonly>

<input type="submit" value="save">
<input type="button" value="Edit" onclick="change()">
</form>

<script type="text/javascript">
function change(){
	    // Get all form elements on the page
	    var formElements = document.getElementsByTagName("input");

	    // Loop through each form element
	    for (var i = 0; i < formElements.length; i++) {
	        var element = formElements[i];

	        // Check if the element has the "required" attribute
	        if (element.hasAttribute("readonly")) {
	            // Remove the "required" attribute
	            element.removeAttribute("readonly");
	        }
	    
	}

}
</script>
</body>
</html>