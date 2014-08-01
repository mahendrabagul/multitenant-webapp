<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring 3 and Hibernate With Data Source Routing</title>
</head>
<body>

	<h2 style="text-align: center">Employee Management</h2>

	<form:form method="post" commandName="employeeBean" id="inputForm"
		action="${employeeBean.tenantName}/add">
		<center>
			<table>
				<tr>
					<td><form:label path="firstname">
							<spring:message code="label.firstname" />
						</form:label></td>
					<td><form:input path="firstname" /></td>
				</tr>
				<tr>
					<td><form:label path="lastname">
							<spring:message code="label.lastname" />
						</form:label></td>
					<td><form:input path="lastname" /></td>
				</tr>
				<tr>
					<td><form:label path="email">
							<spring:message code="label.email" />
						</form:label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><form:label path="telephone">
							<spring:message code="label.telephone" />
						</form:label></td>
					<td><form:input path="telephone" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"
						value="<spring:message code="label.add"/>" /></td>
				</tr>
			</table>
		</center>
	</form:form>

	<!-- <script type="text/javascript">
		function callme(tenant) {
			document.getElementById('inputForm').action = tenant + "/add";
			alert("mahendra" + document.getElementById('inputForm').action);
		}
	</script> -->

	<h3 style="text-align: center">Employees</h3>
	<c:if test="${!empty employeeBeanList}">
		<center>
			<table class="data" border="1">
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Telephone</th>
					<th>&nbsp;</th>
				</tr>
				<c:forEach items="${employeeBeanList}" var="emp">
					<tr>
						<td>${emp.lastname},${emp.firstname}</td>
						<td>${emp.email}</td>
						<td>${emp.telephone}</td>
						<td><a href="${emp.tenantName}/delete/${emp.id}">delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</center>
	</c:if>

</body>
</html>