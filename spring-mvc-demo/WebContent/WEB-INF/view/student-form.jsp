<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Form</h1>
<form:form action="processForm" modelAttribute="student">
First Name:  <form:input path="firstName"/>
Last Name:   <form:input path="lastName"/>
 <br/><br/>
Country:     <form:select path="countryName">
<form:options items="${student.countryOptions}"/>
</form:select>
<br/><br/>
Male:<form:radiobutton path="gender" value="Male"/>
Female:<form:radiobutton path="gender" value="Female"/>
<br/><br/>
Operating Systems:<br/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>
MAC OS<form:checkbox path="operatingSystems" value="MAC OS"/>
Linux<form:checkbox path="operatingSystems" value="Linux"/>

<input type="submit" value="Submit"/>
</form:form>

</body>
</html>