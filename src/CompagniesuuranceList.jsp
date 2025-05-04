<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Compagniesuurance List</title>
</head>
<body>
<center>
<h1>Compagniesuurance List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Id_compagnie</td>
		<td>Nom_compagnie</td>
		<td>Adresse_compagnie</td>
		<td>Notification(FK)</td>
		<td></td>
	</tr>
<%
com.exempls.beans.Compagniesuurance[] compagniesuurances = CompagniesuuranceDAO.listCompagniesuuranceByQuery(null, null);
for(int i = 0; i < compagniesuurances.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(compagniesuurances[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(compagniesuurances[i].getId_compagnie());
		out.println("</td>");
		out.print("<td>");
		out.print(compagniesuurances[i].getNom_compagnie());
		out.println("</td>");
		out.print("<td>");
		out.print(compagniesuurances[i].getAdresse_compagnie());
		out.println("</td>");
		
		Notification notification = compagniesuurances[i].getNotification();
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
		out.print("<a href=\"Compagniesuurance.jsp?action=search&ID=");
		out.print(compagniesuurances[i].getORMID());
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
<a href="Compagniesuurance.jsp">Add Compagniesuurance</a>
</center>
</body>
</html>
