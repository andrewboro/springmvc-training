<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sign Up Form</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<section>
    <h1>Welcome to the course page!<br>Sign up below.</h1>

    <form:form action="processSignUpForm" modelAttribute="student">
        First Name: <form:input path="firstName"/><br><br>
        Last Name: <form:input path="lastName"/><br><br>
        <input type="submit" value="Sign Up"/>
    </form:form>
</section>
</body>
</html>