<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="InformationPersonnelleBean" scope="page" class="InformationPersonnelleProcessor" />
<jsp:setProperty name="InformationPersonnelleBean" property="*" />
<% String result = InformationPersonnelleBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'InformationPersonnelleList.jsp';
		return true;
	}
// -->
</script>
<head><title>InformationPersonnelle</title>
</head>
<body>
<h1>InformationPersonnelle</h1>
<form method="POST" name="form1" action=InformationPersonnelle.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="InformationPersonnelleBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Addresse : </td>
			<td><input type=text name="addresse" value="<jsp:getProperty name="InformationPersonnelleBean" property="addresse"/>" /></td>
		</tr>
		<tr>
			<td>Tel : </td>
			<td><input type=text name="tel" value="<jsp:getProperty name="InformationPersonnelleBean" property="tel"/>" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="email" value="<jsp:getProperty name="InformationPersonnelleBean" property="email"/>" /></td>
		</tr>
		<tr>
			<td>DateNais : </td>
			<td><input type=text name="dateNais" value="<jsp:getProperty name="InformationPersonnelleBean" property="dateNais"/>" /></td>
		</tr>
		<tr>
			<td>Cin : </td>
			<td><input type=text name="cin" value="<jsp:getProperty name="InformationPersonnelleBean" property="cin"/>" /></td>
		</tr>
		<tr>
			<td>Employe_employeID : </td>
			<td><input type=text name="employe_employeID" value="<jsp:getProperty name="InformationPersonnelleBean" property="employe_employeID"/>" /></td>
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
