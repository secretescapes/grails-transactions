<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 3</title>
</head>

<body>
<h1>Authors ${authors.size()}</h1>
<p>A "org.hibernate.HibernateException: No Session found for current thread" exception is thrown as the service method shouldn't attempt to write as it's declared as it doesn't support transactions.</p>

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