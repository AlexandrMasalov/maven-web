import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<h1>Hello, " + name + " " + surname + " </h1>");
		pw.println("</html>");

		// response.sendRedirect("https://www.google.com");
		// response.sendRedirect("/testing.jsp");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/testing.jsp");
		dispatcher.forward(request, response);
	}
}
