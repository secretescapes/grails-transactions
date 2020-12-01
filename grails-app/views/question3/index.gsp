<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Question 3</title>
</head>

<body>
<h1>Question 3</h1>
<p>
	The transaction will be rolled back whenever a runtime exception is thrown from one service to another, even if it gets caught.
</p>
<p>
	If the runtime exception is thrown and caught from the same service, the transaction won't be rolled back.
</p>
<p>
	You can check if a rollback happens by refreshing the option pages: if the number of Authors doesn't change, a ROLLBACK has happened. If it changes, a rollback didn't happen.
</p>
<ul>
	<li><g:link action="optionA">Option A: Runtime exception from the same service, not caught (ROLLBACK)</g:link></li>
	<li><g:link action="optionB">Option B: Runtime exception from the same service, caught (NO ROLLBACK)</g:link></li>
	<li><g:link action="optionC">Option C: Runtime exception from a different service, not caught (ROLLBACK)</g:link></li>
	<li><g:link action="optionD">Option D: Runtime exception from a different service, caught (ROLLBACK)</g:link></li>
	<li><g:link action="optionE">Option E: Checked exception from a different service, not caught (NO ROLLBACK)</g:link></li>
	<li><g:link action="optionF">Option F: checked exception from same service, not caught (NO ROLLBACK)</g:link></li>
</ul>
</body>
</html>