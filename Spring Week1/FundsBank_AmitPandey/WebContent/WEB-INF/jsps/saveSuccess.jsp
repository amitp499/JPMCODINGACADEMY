<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Employee Saved Successfully</title>
</head>
<body>
<h3>
    Complaint Saved Successfully.
</h3>
 

<h4>Complaint Id for the request is ${command.complaintId}</h4><br>
<h4>Thanks for raising a complaint</h4><br>

<a href="GetCheckStatusForm.fb">Check Status</a> <a href="RaiseComplainPage.fb">Raise Complaint</a>
 
</body>
</html>
