<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 2</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<h2>Doesn't ROLLBACK</h2>
<p>
	The service is annotated with static transactional = true, so any checked exception will be wrapped in an unchecked exception,
	which should roll back the transaction. In this case, the service throwing the exception is directly called from the controller,
	so the transaction won't be rolled back.

</p>
<p>Controller -> Service 1 (throws checked exception)</p>
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