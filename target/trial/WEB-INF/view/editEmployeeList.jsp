<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring 3 and Hibernate With Data Source Routing</title>
</head>
<body>

	<h2 style="text-align: center">Employee Management</h2>

	<form:form method="post" action="label.tenantName/add"
		commandName="employeeBean">
		<center>
			<table border="2">
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


	<h3 style="text-align: center">Employees</h3>
	<c:if test="${!empty employeeList}">
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