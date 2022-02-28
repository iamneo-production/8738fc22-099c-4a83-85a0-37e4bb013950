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

@WebServlet(name = "showall",urlPatterns={"/showall"})
public class ShowAllEmployee extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    EmployeeDao dao = new EmployeeDao();
    List<Employee> list = new ArrayList<>();
    try {
         list = dao.showAllEmployee();

    } catch (Exception e) {
        e.printStackTrace();
    }
    if(list.size() >= 1) {
    
     request.setAttribute("employee",list);
      
      RequestDispatcher requestDispatcher = request.getRequestDispatcher("employeeDetails.jsp");
      requestDispatcher.forward(request, response);
    }
  }

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      doGet(request,response);
      }
}

