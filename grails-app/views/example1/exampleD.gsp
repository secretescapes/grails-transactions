<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 1</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<p>
	This service is now properly annotated, and the service method used here is not transactional, so even though
	an exception is thrown, the transaction is not rolled back, so the authors are created and persisted.
</p>
<ul>
	<g:each in="${authors}" var="author">
		<li>${author.name}</li>
	</g:each>
</ul>
</body>
</html>