<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 1</title>
</head>

<body>
<ul>
	<li><g:link action="exampleA">Only method level annotation</g:link></li>
	<li><g:link action="exampleB">Only method level annotation (with static transactional = true)</g:link></li>
	<li><g:link action="exampleC">Class and method level annotations</g:link></li>
</ul>
</body>
</html>