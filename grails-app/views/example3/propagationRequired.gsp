<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 3</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<h2>ROLLBACK</h2>

<ul>
	<g:if test="${flash.message}">
		<div style="color: red;">${flash.message}</div>
	</g:if>
	<g:each in="${authors}" var="author">
		<li>${author.name}</li>
	</g:each>
</ul>
</body>
</html>