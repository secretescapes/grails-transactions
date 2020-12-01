<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 1</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<p>
	The service method is properly annotated as non transactional, so the Author gets saved in the database as the
	transaction doesn't roll back.
</p>
<ul>
	<g:each in="${authors}" var="author">
		<li>${author.name}</li>
	</g:each>
</ul>
</body>
</html>