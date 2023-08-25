package bookWEBapp.pck;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class editServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String id = req.getParameter("id");
				out.println("<h1 align='center'>Enter New Values for the Book-"+id+"");
				out.println("<form action='editURL?id="+id+"' method='get'>");
				out.println("<table >");
				
				
				
				out.println("<tr>");
				out.println("<td>Book Edition</td>");
				out.println("<td><input type='text' name='bookEdition' ></td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>Book Price</td>");
				out.println("<td><input type='text' name='bookPrice' ></td>");
				out.println("</tr>");
				out.println("<td><input type='submit' value='Edit'></td>");
				out.println("<td><input type='reset' value='Cancel'></td>");
				out.println("</table>");
				out.println("</form>");
				
				
				out.print("<a href='home.html'>Home</a>");
	}
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}


}
