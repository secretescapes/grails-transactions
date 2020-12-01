<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Question 1</title>
</head>

<body>
<h1>Question 1</h1>
<p>
	Only option 2 is correct. As the method is properly annotated as non transactional, every time we refresh the page,
	a new Author will get created.
</p>
<p>
	For options 1 and 3, the method will be transactional, so nothing will get stored in the database.
</p>
<ul>
	<li><g:link action="option1">Option 1: static property and class level annotation</g:link></li>
	<li><g:link action="option2">Option 2: Class and method level annotation</g:link></li>
	<li><g:link action="option3">Option 3: Only method level annotation</g:link></li>
</ul>
</body>
</html>