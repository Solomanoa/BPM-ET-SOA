<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Notification List</title>
</head>
<body>
<center>
<h1>Notification List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Notification</td>
		<td>ConsultantRH(FK)</td>
		<td>Compagniesuurance(FK)</td>
		<td>Employe(FK)</td>
		<td></td>
	</tr>
<%
Notification[] notifications = NotificationDAO.listNotificationByQuery(null, null);
for(int i = 0; i < notifications.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(notifications[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(notifications[i].getNotification());
		out.println("</td>");
		
		ConsultantRH consultantRH = notifications[i].getConsultantRH();
		if(consultantRH != null) {
	out.print("<td>");
	out.print("<a href=\"ConsultantRH.jsp?action=search&ID=");
	out.print(consultantRH.getORMID());
	out.print("\">");
	out.print(consultantRH.getORMID());
	out.print("</a>");
	out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		com.exempls.beans.Compagniesuurance compagniesuurance = notifications[i].getCompagniesuurance();
		if(compagniesuurance != null) {
	out.print("<td>");
	out.print("<a href=\"Compagniesuurance.jsp?action=search&ID=");
	out.print(compagniesuurance.getORMID());
	out.print("\">");
	out.print(compagniesuurance.getORMID());
	out.print("</a>");
	out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		Employe employe = notifications[i].getEmploye();
		if(employe != null) {
	out.print("<td>");
	out.print("<a href=\"Employe.jsp?action=search&ID=");
	out.print(employe.getORMID());
	out.print("\">");
	out.print(employe.getORMID());
	out.print("</a>");
	out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Notification.jsp?action=search&ID=");
		out.print(notifications[i].getORMID());
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
<a href="Notification.jsp">Add Notification</a>
</center>
</body>
</html>
