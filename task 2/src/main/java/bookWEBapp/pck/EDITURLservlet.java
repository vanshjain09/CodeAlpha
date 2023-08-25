package bookWEBapp.pck;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editURL")
public class EDITURLservlet extends HttpServlet {
	private static final String query="update BOOKDATA2 set BOOKEDITION=?,BOOKPRICE=? where BOOKNAME=? ";
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get PrintWriter
				PrintWriter pw = res.getWriter();
				//set content type
				res.setContentType("text/html");
				//get the id of record
				String id = req.getParameter("id");
				//get the edit data we want to edit
				
				String bookEdition = req.getParameter("bookEdition");
				float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));
				
				//LOAD jdbc driver
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				}catch(ClassNotFoundException cnf) {
					cnf.printStackTrace();
				}
				
				//generate the connection
				try(Connection con = DriverManager.getConnection("jdbc:mysql:///book","root","Vansh@09");
						PreparedStatement ps = con.prepareStatement(query);){
					
					ps.setString(1, bookEdition);
					ps.setFloat(2, bookPrice);
					ps.setString(3, id);
					
					int count = ps.executeUpdate();
					if(count==1) {
						pw.println("<h2>Record is Edited Successfully</h2>");
					}else {
						pw.println("<h2>Record is not Edited Successfully</h2>");
					}
				}catch(SQLException se) {
					se.printStackTrace();
					pw.println("<h1>"+se.getMessage()+"</h2>");
				}catch(Exception e) {
					e.printStackTrace();
					pw.println("<h1>"+e.getMessage()+"</h2>");
				}
				pw.println("<a href='home.html'>Home</a>");
				pw.println("<br>");
				pw.println("<a href='booklist'>Book List</a>");

			}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
