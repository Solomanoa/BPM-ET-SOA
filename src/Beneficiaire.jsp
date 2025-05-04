<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="BeneficiaireBean" scope="page" class="BeneficiaireProcessor" />
<jsp:setProperty name="BeneficiaireBean" property="*" />
<% String result = BeneficiaireBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'BeneficiaireList.jsp';
		return true;
	}
// -->
</script>
<head><title>Beneficiaire</title>
</head>
<body>
<h1>Beneficiaire</h1>
<form method="POST" name="form1" action=Beneficiaire.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="BeneficiaireBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Nom : </td>
			<td><input type=text name="nom" value="<jsp:getProperty name="BeneficiaireBean" property="nom"/>" /></td>
		</tr>
		<tr>
			<td>LienParente : </td>
			<td><input type=text name="lienParente" value="<jsp:getProperty name="BeneficiaireBean" property="lienParente"/>" /></td>
		</tr>
		<tr>
			<td>ChangementBeneficiaire_changementBeneficiaireID : </td>
			<td><input type=text name="changementBeneficiaire_changementBeneficiaireID" value="<jsp:getProperty name="BeneficiaireBean" property="changementBeneficiaire_changementBeneficiaireID"/>" /></td>
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
