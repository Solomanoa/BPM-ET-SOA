<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>ConsultantRH List</title>
</head>
<body>
<center>
<h1>ConsultantRH List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Nom</td>
		<td>ChangementBeneficiaire(FK)</td>
		<td>Notification(FK)</td>
		<td></td>
	</tr>
<%
ConsultantRH[] consultantRHs = com.exempls.beans.ConsultantRHDAO.listConsultantRHByQuery(null, null);
for(int i = 0; i < consultantRHs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(consultantRHs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(consultantRHs[i].getNom());
		out.println("</td>");
		
		ChangementBeneficiaire changementBeneficiaire = consultantRHs[i].getChangementBeneficiaire();
		if(changementBeneficiaire != null) {
	out.print("<td>");
	out.print("<a href=\"ChangementBeneficiaire.jsp?action=search&ID=");
	out.print(changementBeneficiaire.getORMID());
	out.print("\">");
	out.print(changementBeneficiaire.getORMID());
	out.print("</a>");
	out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		Notification notification = consultantRHs[i].getNotification();
		if(notification != null) {
	out.print("<td>");
	out.print("<a href=\"Notification.jsp?action=search&ID=");
	out.print(notification.getORMID());
	out.print("\">");
	out.print(notification.getORMID());
	out.print("</a>");
	out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"ConsultantRH.jsp?action=search&ID=");
		out.print(consultantRHs[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}
%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="ConsultantRH.jsp">Add ConsultantRH</a>
</center>
</body>
</html>
