<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Beneficiaire List</title>
</head>
<body>
<center>
<h1>Beneficiaire List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Nom</td>
		<td>LienParente</td>
		<td>ChangementBeneficiaire(FK)</td>
		<td></td>
	</tr>
<%
Beneficiaire[] beneficiaires = BeneficiaireDAO.listBeneficiaireByQuery(null, null);
for(int i = 0; i < beneficiaires.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(beneficiaires[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(beneficiaires[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(beneficiaires[i].getLienParente());
		out.println("</td>");
		
		com.exempls.beans.ChangementBeneficiaire changementBeneficiaire = beneficiaires[i].getChangementBeneficiaire();
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
		out.print("<a href=\"Beneficiaire.jsp?action=search&ID=");
		out.print(beneficiaires[i].getORMID());
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
<a href="Beneficiaire.jsp">Add Beneficiaire</a>
</center>
</body>
</html>
