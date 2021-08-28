<%--
  Created by IntelliJ IDEA.
  User: igor
  Date: 28/08/2021
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Spring Advanced EPAM Course</title>
</head>
<body>
<h1>Upload a file with telephone directory</h1>
<form method="POST" action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data">
	<input type="file" name="file"/><br/>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>
