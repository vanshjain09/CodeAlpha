package bookWEBapp.pck;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/booklist")
public class bookListServlet extends HttpServlet {
	
	private static final String query="SELECT BOOKNAME, BOOKEDITION,BOOKPRICE FROM BOOKDATA2" ;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql:///book","root","Vansh@09");
		    PreparedStatement ps = con.prepareStatement(query);
		    ResultSet rs = ps.executeQuery();) {
		    
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			out.println("<title>Registered Books</title>");
			out.println("<style>");
			out.println("body { font-family: Arial, sans-serif; background-color: #f8f9fa; margin: 0; padding: 0; }");
			out.println("table { border-collapse: collapse; width: 80%; margin: auto; margin-top: 30px; background-color: #fff; }");
			out.println("th, td { border: 1px solid #dee2e6; padding: 8px; text-align: center; }");
			out.println("th { background-color: #343a40; color: #fff; }");
			out.println("a { text-decoration: none; color: #007bff; }");
			out.println("a:hover { text-decoration: underline; }");
			out.println("</style>");
			out.println("</head>");
			out.println("<body>");
			
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Book Name</th>");
			out.println("<th>Book Edition</th>");
			out.println("<th>Book Price</th>");
			out.println("<th>Edit</th>");
			out.println("<th>Delete</th>");
			out.println("</tr>");
			
			while(rs.next()) {
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getFloat(3)+"</td>");
				out.println("<td><a href='edit?id="+rs.getString(1)+"'>Edit</a></td>");
				out.println("<td><a href='delete?id="+rs.getString(1)+"'>Delete</a></td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			out.println("<a href='home.html'>Home</a>");
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
