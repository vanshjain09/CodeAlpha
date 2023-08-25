package bookWEBapp.pck;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
    private static final String query="INSERT INTO BOOKDATA2(BOOKNAME, BOOKEDITION,BOOKPRICE) VALUES(?,?,?)" ;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String bookName = req.getParameter("bookName");
		String bookEdition = req.getParameter("bookEdition");
		float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql:///book","root","Vansh@09");
		    PreparedStatement ps = con.prepareStatement(query);) {
		    
			ps.setString(1,bookName);
			ps.setString(2,bookEdition);
			ps.setFloat(3,bookPrice);
			int flag = ps.executeUpdate();
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.println("<title>Record Registered</title>");
			out.println("<style>");
			out.println("body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }");
			out.println("h2 { color: #007bff; }");
			out.println("a { text-decoration: none; color: #007bff; }");
			out.println("a:hover { text-decoration: underline; }");
			out.println("</style>");
			out.println("</head>");
			out.println("<body>");
			
			if(flag == 1) {
				out.println("<h2>Record Registered Successfully</h2>");
			} else {
				out.println("<h2>Record not submitted</h2>");
			}
			
			out.println("<a href='home.html'>Home</a><br>");
			out.println("<a href='booklist'>Click here to show all registered books</a>");
			out.println("</body>");
			out.println("</html>");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
