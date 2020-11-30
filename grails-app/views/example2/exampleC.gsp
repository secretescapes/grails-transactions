<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 2</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<h2>Doesn't ROLLBACK</h2>
<p>
	Both services are annotated, so the checked exception won't be wrapped. Checked exceptions do not trigger a rollback.

</p>
<p>Controller -> Service 1 (annotated) -> Service 2(annotated, throws checked exception)</p>
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