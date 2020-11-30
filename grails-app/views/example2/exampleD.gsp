<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 2</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<h2>ROLLBACK</h2>
<p>
	The first service swallows the exception, but that doesn't prevent the transaction from being rolled back.

</p>
<p>Controller -> Service 1 (swallow the exception) -> Service 2(throws unchecked exception)</p>
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