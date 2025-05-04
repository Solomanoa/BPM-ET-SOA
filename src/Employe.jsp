<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="EmployeBean" scope="page" class="com.exempls.beans.EmployeProcessor" />
<jsp:setProperty name="EmployeBean" property="*" />
<% String result = EmployeBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'EmployeList.jsp';
		return true;
	}
// -->
</script>
<head><title>Employe</title>
</head>
<body>
<h1>Employe</h1>
<form method="POST" name="form1" action=Employe.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="EmployeBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Nom : </td>
			<td><input type=text name="nom" value="<jsp:getProperty name="EmployeBean" property="nom"/>" /></td>
		</tr>
		<tr>
			<td>Matricule : </td>
			<td><input type=text name="matricule" value="<jsp:getProperty name="EmployeBean" property="matricule"/>" /></td>
		</tr>
		<tr>
			<td>InformationPersonnelle_informationPersonnelleID : </td>
			<td><input type=text name="informationPersonnelle_informationPersonnelleID" value="<jsp:getProperty name="EmployeBean" property="informationPersonnelle_informationPersonnelleID"/>" /></td>
		</tr>
		<tr>
			<td>Notification_notificationID : </td>
			<td><input type=text name="notification_notificationID" value="<jsp:getProperty name="EmployeBean" property="notification_notificationID"/>" /></td>
		</tr>
		<tr>
			<td>ChangementBeneficiaire_changementBeneficiaireID : </td>
			<td><input type=text name="changementBeneficiaire_changementBeneficiaireID" value="<jsp:getProperty name="EmployeBean" property="changementBeneficiaire_changementBeneficiaireID"/>" /></td>
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
