<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
    prefix="springForm"%>
    
<html>
<head>

<script type="text/javascript">
    function validateAccountId(){
        x=document.myForm
        txt=x.myInput.value
        if (txt>10 && txt<10) {
            return true
        }else{
            alert("Must be between 1 and 5")
            return false
        }
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title align=center>Insert title here</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>

	<h1>Raise Complaint - Page</h1>
	
	<springForm:form method="POST" commandName="command"
        action="submitComplaintData.fb" class="container"  >
        <table class="table">
            <tr>
                <td>Account ID:</td>
                <td><springForm:input path="accountId" maxlength="10" minlength="10"/></td>
                <td><springForm:errors path="accountId" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Branch Code:</td>
                <td><springForm:input path="branchCode" /></td>
                <td><springForm:errors path="branchCode" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Email Id:</td>
                <td><springForm:input path="emailId" type="email"/></td>
                <td><springForm:errors path="emailId" cssClass="error" /></td>
            </tr>
            
            <tr>
            	<td>Complain Category:</td>
               
                	
                <td><springForm:select path="category">
                        <springForm:option value="" label="Select Complaint Category" />
                        <springForm:option value="Internet Banking" label="Internet Banking" />
                        <springForm:option value="General Banking" label="General Banking" />
                        <springForm:option value="Others" label="Others" />
                    </springForm:select></td>
                <td><springForm:errors path="category" cssClass="error" /></td>
           
               
                
            </tr>
            
            <tr>
            	<td>Description:</td>
                <td><springForm:textarea name="description" rows="10" cols="30" path="description"></springForm:textarea></td>
                <td><springForm:errors path="description" cssClass="error" /></td>
            </tr>
           
            <tr>
                <td colspan="3"><input type="submit" value="Save" class ="btn btn-primary btn-lg"></td>
            </tr>
        </table>
 
    </springForm:form>

<a href="GetCheckStatusForm.fb">Check Status</a>
</body>
</html>