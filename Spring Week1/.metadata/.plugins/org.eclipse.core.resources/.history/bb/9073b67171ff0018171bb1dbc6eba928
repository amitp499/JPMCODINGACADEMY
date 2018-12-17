<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Insert title here</title>
		</head>
		<body>
			<%---${requestScope.empList} --%>
			<jsp:include page="head01.jsp"></jsp:include>
<jsp:include page="head02.jsp"></jsp:include>
			<!--  Welcome Mr. ${sessionScope.userFullName}-->
			<table border=1>
				<tr>
					<td>Department Name</td>
					<td>Department Id</td>
					
					
				</tr>
				
				
				<c:forEach items="${requestScope.DepartmentList}" var="emp">
				
				<tr>
					<td> ${ emp.deptNo } </td>     <!-- getEmpId -->
					<td> ${ emp.deptName } </td>     <!-- getEmpId -->														
					<td> <a href="getDeptDetails.hr?id=${ emp.deptNo }">View</a> </td>     <!-- getEmpId -->
				</tr>
					
				</c:forEach>
				
				
				
				
				
				
			</table>
			<br>
				<a href="homePage.hr">Back To Main Menu</a>
				<!-- <a href="Logout.do">Logout</a> -->
		</body>
</html>