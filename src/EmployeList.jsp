<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Employe List</title>
</head>
<body>
<center>
<h1>Employe List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Nom</td>
		<td>Matricule</td>
		<td>InformationPersonnelle(FK)</td>
		<td>Notification(FK)</td>
		<td>ChangementBeneficiaire(FK)</td>
		<td></td>
	</tr>
<%
Employe[] employes = EmployeDAO.listEmployeByQuery(null, null);
for(int i = 0; i < employes.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(employes[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(employes[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(employes[i].getMatricule());
		out.println("</td>");
		
		com.exempls.beans.InformationPersonnelle informationPersonnelle = employes[i].getInformationPersonnelle();
		if(informationPersonnelle != null) {
	out.print("<td>");
	out.print("<a href=\"InformationPersonnelle.jsp?action=search&ID=");
	out.print(informationPersonnelle.getORMID());
	out.print("\">");
	out.print(informationPersonnelle.getORMID());
	out.print("</a>");
	out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		Notification notification = employes[i].getNotification();
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
		
		
		ChangementBeneficiaire changementBeneficiaire = employes[i].getChangementBeneficiaire();
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
		
		out.print("<td>");
		out.print("<a href=\"Employe.jsp?action=search&ID=");
		out.print(employes[i].getORMID());
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
<a href="Employe.jsp">Add Employe</a>
</center>
</body>
</html>
