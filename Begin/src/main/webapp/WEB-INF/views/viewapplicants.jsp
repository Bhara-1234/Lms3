<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.services.LmsServiceImpl,com.model.LoanApplication,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<th>Loan Id</th>
		<th>CustomerId</th>
		<th>Applied Date</th>
		<th>Loan Type</th>
		<th>Loan Amount</th>
		<th>Emi Range From</th>
		<th>Emi Range To</th>
		<th>NuberOfYears</th>
		<th>Nominee</th>
		<th>Cibil</th>
		<th>Status</th>
		<th>Remarks</th>
		<th>ProcessedDate</th>
		<th>ProcessedUser</th>
		<th>Manage</th>
		<%
		ArrayList<LoanApplication> applicants = (ArrayList<LoanApplication>) request.getAttribute("applicants");
		for (LoanApplication app : applicants) {
		%>
		<tr>
			<td><%=app.getLnap_id()%></td>
			<td><%=app.getLnap_cust_id()%></td>
			<td><%=app.getLnap_apdate()%></td>
			<td><%=app.getLnap_lnty_id()%></td>
			<td><%=app.getLnap_amount()%></td>
			<td><%=app.getLnap_emi_range_from()%></td>
			<td><%=app.getLnap_emi_range_to()%></td>
			<td><%=app.getLnap_noy()%></td>
			<td><%=app.getLnap_nom_requested()%></td>
			<td><%=app.getLnap_cibil_Score()%></td>
			<td><%=app.getLnap_status()%></td>
			<td><%=app.getLnap_conclusion_remarks()%></td>
			<td><%=app.getLnap_processed_Date()%></td>
			<td><%=app.getLnap_processed_user()%></td>
			<td><form action="edit">
			<input type="hidden"  name="lnap_id"	value="<%=app.getLnap_id()%>">
			<input type="submit" value="View/Edit"></form></td>
		</tr>

		<!-- 	int lnap_id;
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



		<%
		}
		%>
	</table>

</body>
</html>