import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import logic.Cart;

public class FirstServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		String user = (String) session.getAttribute("current_user");
		if (user == null) {
			//response для анонимного пользователя
			//авторизация
			//регистрация
			//session.setAttribute("current_user", ID);
		} else {
			//response для авторизованного пользователя
		}

		//Сессии
		// Cart cart = (Cart) session.getAttribute("cart");
		// String name = request.getParameter("name");
		// int quantity = Integer.parseInt(request.getParameter("quantity"));
		// if (cart == null) {
		// 	cart = new Cart();
		// 	cart.setName(name);
		// 	cart.setQuantity(quantity);
		// }
		// session.setAttribute("cart", cart);
		// getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

		// Integer count = (Integer) session.getAttribute("count");
		// if (count == null) {
		// 	session.setAttribute("count", 1);
		// 	count = 1;
		// } else {
		// 	session.setAttribute("count", count++);
		// }


		//Значения из url-параметров.
		// String name = request.getParameter("name");
		// String surname = request.getParameter("surname");

		// PrintWriter pw = response.getWriter();
		// pw.println("<html>");
		// pw.println("<h1> Your count is " + count + " </h1>");

		// Значения из url-параметров.
		// pw.println("<h1>Hello, " + name + " " + surname + " </h1>");
		// pw.println("</html>");

		//Redirect
		// response.sendRedirect("https://www.google.com");
		// response.sendRedirect("/testing.jsp");

		//Forward
		// RequestDispatcher dispatcher = request.getRequestDispatcher("/testing.jsp");
		// dispatcher.forward(request, response);
	}
}
