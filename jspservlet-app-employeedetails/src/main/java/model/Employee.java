package model;

public class Employee {
    private int employee_id;
    private String employee_name;
    private String employee_role;
    private int employee_salary;
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public String getEmployee_role() {
        return employee_role;
    }
    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }
    public int getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }
    @Override
	public String toString() {
		return "Employee [id=" + employee_id + ", name=" + employee_name + ", role=" + employee_role + ", salary=" + employee_salary + "]";
	}   
}
