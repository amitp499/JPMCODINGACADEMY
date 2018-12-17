<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jp.hr.entities.Employee" %>
    <%@ page import="java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	Welcome Mr. ${sessionScope.userFullName}
	<table border=1>
				<tr>
					<td>Employee Id</td>
					<td>Employee Name</td>
					<td>Employee Salary</td>
					<td>Dept Name</td>
					<td>Dept No</td>
					
				</tr>
				
				<tr>
					<td>${requestScope.EmployeeDetails.empNo}</td>
					<td>${requestScope.EmployeeDetails.empNm}</td>
					<td>${requestScope.EmployeeDetails.empSal}</td>
					<td>${requestScope.EmployeeDetails.dept.deptName}</td>
					<td>${requestScope.EmployeeDetails.dept.deptNo}</td>
				</tr>
				
				</table>
				<br>
				<a href="getEmpList.hr">Go Back to Employee List</a>
				<a href="Logout.do">Logout</a>
</body>
</html>