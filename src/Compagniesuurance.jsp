<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="CompagniesuuranceBean" scope="page" class="CompagniesuuranceProcessor" />
<jsp:setProperty name="CompagniesuuranceBean" property="*" />
<% String result = CompagniesuuranceBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'CompagniesuuranceList.jsp';
		return true;
	}
// -->
</script>
<head><title>Compagniesuurance</title>
</head>
<body>
<h1>Compagniesuurance</h1>
<form method="POST" name="form1" action=Compagniesuurance.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="CompagniesuuranceBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Id_compagnie : </td>
			<td><input type=text name="id_compagnie" value="<jsp:getProperty name="CompagniesuuranceBean" property="id_compagnie"/>" /></td>
		</tr>
		<tr>
			<td>Nom_compagnie : </td>
			<td><input type=text name="nom_compagnie" value="<jsp:getProperty name="CompagniesuuranceBean" property="nom_compagnie"/>" /></td>
		</tr>
		<tr>
			<td>Adresse_compagnie : </td>
			<td><input type=text name="adresse_compagnie" value="<jsp:getProperty name="CompagniesuuranceBean" property="adresse_compagnie"/>" /></td>
		</tr>
		<tr>
			<td>Notification_notificationID : </td>
			<td><input type=text name="notification_notificationID" value="<jsp:getProperty name="CompagniesuuranceBean" property="notification_notificationID"/>" /></td>
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
