<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Option B</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<p>
	The exception is thrown and capture within the same service. NO ROLLBACK.
</p>
<g:if test="${flash.message}">
	<div style="color: red;">${flash.message}</div>
</g:if>
<ul>
	<g:each in="${authors}" var="author">
		<li>${author.name}</li>
	</g:each>
</ul>
</body>
</html>