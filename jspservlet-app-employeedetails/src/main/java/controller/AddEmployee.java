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

@WebServlet(name = "addemployee",urlPatterns={"/addemployee"})
public class AddEmployee extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
      
      
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        boolean flag = false;

        String employee_id = request.getParameter("employee_id");
        String employee_name = request.getParameter("employee_name");
        String employee_role = request.getParameter("employee_role");
        String employee_salary = request.getParameter("employee_salary");

        Employee employee = new Employee();
        employee.setEmployee_id(Integer.parseInt(employee_id));
        employee.setEmployee_name(employee_name);
        employee.setEmployee_role(employee_role);
        employee.setEmployee_salary(Integer.parseInt(employee_salary));

        try {
            EmployeeDao dao = new EmployeeDao();
        	flag = dao.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(flag) {
          List<Employee> employeelist = new ArrayList<>();
          employeelist.add(employee);
          request.setAttribute("employee",employeelist);
          // request.setAttribute("name",employee.getEmployee_name());
          // request.setAttribute("role",employee.getEmployee_role());
          // request.setAttribute("salary", employee.getEmployee_salary());

          RequestDispatcher requestDispatcher = request.getRequestDispatcher("employeeDetails.jsp");
          requestDispatcher.forward(request, response);
        }
    }
}

