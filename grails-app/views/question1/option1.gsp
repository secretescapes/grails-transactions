<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 1</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<p>
	The service method is transactional, so the transaction gets rolled back and nothing gets saved.
</p>
<ul>
	<g:each in="${authors}" var="author">
		<li>${author.name}</li>
	</g:each>
</ul>
</body>
</html>