package controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import model.Employee;
import service.EmployeeDao;

@WebServlet(name = "showemployee",urlPatterns={"/showemployee"})
public class ShowEmployee extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    
    EmployeeDao dao = new EmployeeDao();
    int employee_id = Integer.parseInt(request.getParameter("id"));
    List<Employee> list = new ArrayList<>();
    try {
         list = dao.viewEmployeeById(employee_id);

    } catch (Exception e) {
        e.printStackTrace();
    }
    
    System.out.println(list.toString());
      RequestDispatcher requestDispatcher = request.getRequestDispatcher("employeeDetails.jsp");
      request.setAttribute("employee", list);
      requestDispatcher.forward(request, response);
    
}
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      doGet(request,response);
      }
}

