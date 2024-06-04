<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
	<head>
		<title>Show Cart JSP</title>
	</head>
	<body>
		<%@ page import="logic.Cart" %>

		<% Cart cart = (Cart) session.getAttribute("cart"); %>

		<p>Наименование: <%= cart.getName() %></p>
		<p>Количество: <%= cart.getQuantity() %></p>
	</body>
</html>
