<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="ChangementBeneficiaireBean" scope="page" class="ChangementBeneficiaireProcessor" />
<jsp:setProperty name="ChangementBeneficiaireBean" property="*" />
<% String result = ChangementBeneficiaireBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ChangementBeneficiaireList.jsp';
		return true;
	}
// -->
</script>
<head><title>ChangementBeneficiaire</title>
</head>
<body>
<h1>ChangementBeneficiaire</h1>
<form method="POST" name="form1" action=ChangementBeneficiaire.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ChangementBeneficiaireBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Ancien_beneficiare : </td>
			<td><input type=text name="ancien_beneficiare" value="<jsp:getProperty name="ChangementBeneficiaireBean" property="ancien_beneficiare"/>" /></td>
		</tr>
		<tr>
			<td>Nouveau_beneficiaire : </td>
			<td><input type=text name="nouveau_beneficiaire" value="<jsp:getProperty name="ChangementBeneficiaireBean" property="nouveau_beneficiaire"/>" /></td>
		</tr>
		<tr>
			<td>Date_changement : </td>
			<td><input type=text name="date_changement" value="<jsp:getProperty name="ChangementBeneficiaireBean" property="date_changement"/>" /></td>
		</tr>
		<tr>
			<td>Employe_employeID : </td>
			<td><input type=text name="employe_employeID" value="<jsp:getProperty name="ChangementBeneficiaireBean" property="employe_employeID"/>" /></td>
		</tr>
		<tr>
			<td>ConsultantRH_consultantRHID : </td>
			<td><input type=text name="consultantRH_consultantRHID" value="<jsp:getProperty name="ChangementBeneficiaireBean" property="consultantRH_consultantRHID"/>" /></td>
		</tr>
		<tr>
			<td>Beneficiaire_beneficiaireID : </td>
			<td><input type=text name="beneficiaire_beneficiaireID" value="<jsp:getProperty name="ChangementBeneficiaireBean" property="beneficiaire_beneficiaireID"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
