package service;
import utility.ConnectionManager;
import model.Employee;
import java.util.*;

import java.sql.*;
public class EmployeeDao {

public boolean addEmployee(Employee employee) {
    Connection con = ConnectionManager.getConn();
    String sql = "insert into employeedetails(employee_id,employee_name,employee_role,employee_salary) values (?,?,?,?) ";
    int i = 0;
    try {
      PreparedStatement preparedStatement = con.prepareStatement(sql);
      preparedStatement.setInt(1, employee.getEmployee_id());
      preparedStatement.setString(2, employee.getEmployee_name());
      preparedStatement.setString(3, employee.getEmployee_role());
      preparedStatement.setInt(4, employee.getEmployee_salary());
      
      i = preparedStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    if (i == 0) {
      return false;
    } else {
      return true;
    }
  }

  public List<Employee> viewEmployeeById(int employee_id){
    Connection connection = ConnectionManager.getConn();
    String sql = "Select * from employeedetails where employee_id = ?";
    List<Employee> list = new ArrayList<>();
    try{
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, employee_id);
      ResultSet resultSet = preparedStatement.executeQuery();
      
      while (resultSet.next()) {
        Employee emp = new Employee();
        emp.setEmployee_id(resultSet.getInt("employee_id"));
        emp.setEmployee_name(resultSet.getString("employee_name"));
        emp.setEmployee_role(resultSet.getString("employee_role"));
        emp.setEmployee_salary(resultSet.getInt("employee_salary"));
        list.add(emp);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }
  
  public List<Employee> showAllEmployee(){
    Connection connection = ConnectionManager.getConn();
    String sql = "Select * from employeedetails";
    List<Employee> list = new ArrayList<>();
    try{
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      ResultSet resultSet = preparedStatement.executeQuery();
      
      while (resultSet.next()) {
        Employee emp = new Employee();
        emp.setEmployee_id(resultSet.getInt("employee_id"));
        emp.setEmployee_name(resultSet.getString("employee_name"));
        emp.setEmployee_role(resultSet.getString("employee_role"));
        emp.setEmployee_salary(resultSet.getInt("employee_salary"));
        list.add(emp);
      }
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }

  public boolean updateEmployee(Employee employee) {
    Connection connection = ConnectionManager.getConn();
    String sql = "update employeedetails set employee_name=?, employee_role=?, employee_salary=? ";
    sql += " where id=? ";
    int i = 0;
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1, employee.getEmployee_name());
      preparedStatement.setString(2, employee.getEmployee_role());
      preparedStatement.setInt(3, employee.getEmployee_salary());
      preparedStatement.setInt(4, employee.getEmployee_id());
      i = preparedStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    if (i == 0) {
      return false;
    } else {
      return true;
    }
  }

  public void deleteEmployee(int employee_id) {
    Connection connection = ConnectionManager.getConn();
    String sql = "delete from employeedetails where id=?";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, employee_id);
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}