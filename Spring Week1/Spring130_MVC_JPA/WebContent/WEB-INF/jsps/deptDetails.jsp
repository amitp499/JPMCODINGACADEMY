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
		
			<%-- ${requestScope.DepartmentDetails} --%>
			
			<jsp:include page="head01.jsp"></jsp:include>
			<jsp:include page="head02.jsp"></jsp:include>
			<!--  Welcome Mr. ${sessionScope.userFullName}-->
			<%-- <table border=1>
				<tr>
					<td>Department No</td>
					<td>Department Name</td>										
				</tr>
																
				<tr>									
					<td> ${ requestScope.DepartmentDetails.deptName } </td>     <!-- getEmpId -->
					<td> ${ requestScope.DepartmentDetails.deptNo } </td>     <!-- getEmpId -->															
				</tr>											
			</table> --%>
			
			<table border=1>
				<tr>
					<td>Employee No</td>
					<td>Employee Name</td>
					<td>Employee Salary</td>													
					<td>Employee Department Name</td>
					<td>Employee Department Id</td>
				</tr>
								
				<c:forEach items="${requestScope.DepartmentDetails.empList}" var="emp">
				
				<tr>
					<td> ${ emp.empNo } </td>     <!-- getEmpId -->
					<td> ${ emp.empNm } </td>     <!-- getEmpId -->
					<td> ${ emp.empSal } </td>     <!-- getEmpId -->
					<td> ${ requestScope.DepartmentDetails.deptName } </td>     <!-- getEmpId -->		
					<td> ${ requestScope.DepartmentDetails.deptNo } </td>     <!-- getEmpId -->																			
					
				</tr>
					
				</c:forEach>
																
			</table>
			<br>
				<a href="homePage.hr">Back To Main Menu</a>
				<!-- <a href="Logout.do">Logout</a> -->
			
		</body>
</html>
