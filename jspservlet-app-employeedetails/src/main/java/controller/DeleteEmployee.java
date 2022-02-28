package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmployeeDao;

@WebServlet(name = "deleteemployee",urlPatterns={"/deleteemployee"})
public class DeleteEmployee extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    EmployeeDao dao = new EmployeeDao();
    int employee_id = Integer.parseInt(request.getParameter("id"));
    
    try {
        dao.deleteEmployee(employee_id);

    } catch (Exception e) {
        e.printStackTrace();
    }
    
      
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      doGet(request,response);
      }
}
