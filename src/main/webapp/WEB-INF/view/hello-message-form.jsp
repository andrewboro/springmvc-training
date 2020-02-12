<!doctype html>

<html>
<head>
    <title>Hello name form.</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<section>
    <form action="processHelloMessageForm" method="GET">
        <label for="studentName">Name:</label> <input type="text" id="studentName" name="studentName" placeholder="What's your name?"/>
        <input type="submit"/>
    </form>
</section>
</body>
</html>