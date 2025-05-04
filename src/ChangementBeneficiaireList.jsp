<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>ChangementBeneficiaire List</title>
</head>
<body>
<center>
<h1>ChangementBeneficiaire List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Ancien_beneficiare</td>
		<td>Nouveau_beneficiaire</td>
		<td>Date_changement</td>
		<td>Employe(FK)</td>
		<td>ConsultantRH(FK)</td>
		<td>Beneficiaire(FK)</td>
		<td></td>
	</tr>
<%
com.exempls.beans.ChangementBeneficiaire[] changementBeneficiaires = ChangementBeneficiaireDAO.listChangementBeneficiaireByQuery(null, null);
for(int i = 0; i < changementBeneficiaires.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(changementBeneficiaires[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(changementBeneficiaires[i].getAncien_beneficiare());
		out.println("</td>");
		out.print("<td>");
		out.print(changementBeneficiaires[i].getNouveau_beneficiaire());
		out.println("</td>");
		out.print("<td>");
		out.print(changementBeneficiaires[i].getDate_changement());
		out.println("</td>");
		
		Employe employe = changementBeneficiaires[i].getEmploye();
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
		
		
		ConsultantRH consultantRH = changementBeneficiaires[i].getConsultantRH();
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
		
		
		Beneficiaire beneficiaire = changementBeneficiaires[i].getBeneficiaire();
		if(beneficiaire != null) {
	out.print("<td>");
	out.print("<a href=\"Beneficiaire.jsp?action=search&ID=");
	out.print(beneficiaire.getORMID());
	out.print("\">");
	out.print(beneficiaire.getORMID());
	out.print("</a>");
	out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"ChangementBeneficiaire.jsp?action=search&ID=");
		out.print(changementBeneficiaires[i].getORMID());
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
<a href="ChangementBeneficiaire.jsp">Add ChangementBeneficiaire</a>
</center>
</body>
</html>
