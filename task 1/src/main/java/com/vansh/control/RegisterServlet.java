package com.vansh.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rollNumber = request.getParameter("rollNumber");
        String studentName = request.getParameter("studentName");
        
        // Perform database insertion logic here
        PrintWriter out = response.getWriter();
        // Set the fetched data as request attribute
        response.setContentType("text/html");
        out.print("<h3 style='color: green;'>Registration Successful</h3>");
        request.getRequestDispatcher("/registration.jsp").include(request, response);
    }
}
