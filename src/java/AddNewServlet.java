/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import service.EmployeeBean;

import model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bure Kabisa
 */
 
//...import statements
 
@WebServlet(name = "AddNewServlet", urlPatterns = {"/AddNewServlet"})
public class AddNewServlet extends HttpServlet {
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Employee emp = new Employee();
        emp.setEmpId(Integer.parseInt(request.getParameter("empId")));
        emp.setName(request.getParameter("empName"));
        emp.setPhone(request.getParameter("phone"));
        emp.setEmail(request.getParameter("email"));
        emp.setSalary(Float.parseFloat(request.getParameter("salary")));
        emp.setDesignation(request.getParameter("designation"));
        EmployeeBean eb = new EmployeeBean();
        eb.addNew(emp);
        response.sendRedirect("empView.jsp");
 
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}