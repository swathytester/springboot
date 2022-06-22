<%@page import="com.cg.web.model.Employee"%>
<%@page isELIgnored="false"%>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>

<%-- <% Employee emp=(Employee)request.getAttribute("employee"); %>

<h2>Hello <span style="color:blue;"><%out.println(emp);%></span></h2> --%>

<h2>Employee Details - </h2>

<table class="table table-dark">
<thead>
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Salary</th>
	<th>Join Date</th>
</tr>

</thead>

<tbody>
<tr>
<td>${employee.employeeId}</td>
<td>${employee.firstName} ${employee.lastName}</td>
<td>${employee.email}</td>
<td>${employee.salary}</td>
<td>${employee.hiredaDate}</td>


</tr>

</tbody>

</table>



</body>
</html>
