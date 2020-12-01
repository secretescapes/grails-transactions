<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Example 2</title>
</head>

<body>
<ul>
	<li><g:link action="exampleA">Static transactional = true. A service calls another one. The checked exception is wrapped in an unchecked exception, so rollback happens.</g:link></li>
	<li><g:link action="exampleB">Static transactional = true. The service called by the controller throws the checked exception, that gets wrapped in an unchecked exception. Rollback doesn't happen.</g:link></li>
	<li><g:link action="exampleC">Annotated services. A service calls another one. The checked exception is NOT wrapped, so it doesn't trigger a rollback.</g:link></li>
	<li><g:link action="exampleD">Annotated services, swallow exception. A service calls another one in a try/catch. The unchecked exception is caught, but the transaction is rolled back.</g:link></li>
	<li><g:link action="exampleE">Annotated services. Create the object and throws a checked exception, so no rollback.</g:link></li>
</ul>
</body>
</html>