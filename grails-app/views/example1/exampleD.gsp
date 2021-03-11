<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 1</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<p>
	This service is now properly annotated, and the service method used here is transactional, even though
	the service is set as non transactional by the static property.
</p>
<ul>
	<g:each in="${authors}" var="author">
		<li>${author.name}</li>
	</g:each>
</ul>
</body>
</html>