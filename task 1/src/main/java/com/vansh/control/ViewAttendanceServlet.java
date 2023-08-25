package com.vansh.control;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewAttendanceServlet")
public class ViewAttendanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String course = request.getParameter("course");
        String fromDate = request.getParameter("fromDate");
        String toDate = request.getParameter("toDate");
        String studentRollNumber = request.getParameter("studentRollNumber");
        
        // Fetch attendance records from the database based on the criteria
        
        request.getRequestDispatcher("viewattendance.jsp").forward(request, response);
    }
}
