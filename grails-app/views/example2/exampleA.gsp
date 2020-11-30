<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 2</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<h2>ROLLBACK</h2>
<p>
	The service is annotated with static transactional = true, so any checked exception will be wrapped in an unchecked exception,
	rolling back the transaction. In this case, the service throwing the exception is not the one called from the controller.

</p>
<p>Controller -> Service 1 -> Service 2 (throws checked exception)</p>
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