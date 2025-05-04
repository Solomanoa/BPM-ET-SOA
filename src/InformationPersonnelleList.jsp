<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>InformationPersonnelle List</title>
</head>
<body>
<center>
<h1>InformationPersonnelle List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Addresse</td>
		<td>Tel</td>
		<td>Email</td>
		<td>DateNais</td>
		<td>Cin</td>
		<td>Employe(FK)</td>
		<td></td>
	</tr>
<%
com.exempls.beans.InformationPersonnelle[] informationPersonnelles = InformationPersonnelleDAO.listInformationPersonnelleByQuery(null, null);
for(int i = 0; i < informationPersonnelles.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(informationPersonnelles[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(informationPersonnelles[i].getAddresse());
		out.println("</td>");
		out.print("<td>");
		out.print(informationPersonnelles[i].getTel());
		out.println("</td>");
		out.print("<td>");
		out.print(informationPersonnelles[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(informationPersonnelles[i].getDateNais());
		out.println("</td>");
		out.print("<td>");
		out.print(informationPersonnelles[i].getCin());
		out.println("</td>");
		
		Employe employe = informationPersonnelles[i].getEmploye();
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
		out.print("<a href=\"InformationPersonnelle.jsp?action=search&ID=");
		out.print(informationPersonnelles[i].getORMID());
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
<a href="InformationPersonnelle.jsp">Add InformationPersonnelle</a>
</center>
</body>
</html>
