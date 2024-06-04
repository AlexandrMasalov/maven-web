<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
	<head>
		<title>First JSP</title>
	</head>
	<body>
		<h1>Testing JSP</h1>
		<p>
			<%@ page import="java.util.Date, logic.TestClass" %>

			<%
				Date now = new Date();
				String someString = "Текущая дата : " + now;
				TestClass tc = new TestClass();
				out.println("Testing println");
			%>
			<%= someString %>
			<%= tc.getInfo() %>
		</p>
	</body>
</html>
