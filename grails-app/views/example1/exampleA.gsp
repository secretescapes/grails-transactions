<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 1</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<p>
	As the service used here is not properly annotated, the @NotTransactional annotation doesn't work and the service method
	remains transactional. As a runtime exception is thrown, the transaction is rolled back, so there are no authors to show.
</p>
<ul>
	<g:each in="${authors}" var="author">
		<li>${author.name}</li>
	</g:each>
</ul>
</body>
</html>