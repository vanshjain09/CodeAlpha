package com.vansh.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/UpdateAttendanceServlet")
public class UpdateAttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String course = request.getParameter("course");
        String attendanceDate = request.getParameter("attendanceDate");
        String studentRollNumber = request.getParameter("studentRollNumber");
        boolean isPresent = "on".equals(request.getParameter("isPresent"));
        
        // Perform database update logic here
        PrintWriter out = response.getWriter();
        // Set the fetched data as request attribute
        response.setContentType("text/html");
        out.print("<h3 style='color: green;'>Record Updated</h3>");
        request.getRequestDispatcher("/updateattendance.jsp").include(request, response);
    }
}
