package bookWEBapp.pck;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class deleteServlet extends HttpServlet {
	private static final String query = "delete from BOOKDATA2 where BOOKNAME=? ";
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try( Connection con = DriverManager.getConnection("jdbc:mysql:///book","root","Vansh@09");
				PreparedStatement ps = con.prepareStatement(query);){
			
				ps.setString(1, req.getParameter("id"));
				
				
				int flag = ps.executeUpdate();
				if(flag==1) {
					out.println("<h2>Record Deleted Successfully</h2>");
				}
				else {
					out.println("<h2>Record not Deleted</h2>");
				}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			out.print("<a href='home.html'>Home</a>");
			out.print("</br>");
			out.println("<a href='booklist'>Click here to show all registered books</a>");
}
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
