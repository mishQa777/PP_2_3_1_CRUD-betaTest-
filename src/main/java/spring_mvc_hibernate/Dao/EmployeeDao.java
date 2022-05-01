package spring_mvc_hibernate.Dao;

import spring_mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();
    public void saveEmployee (Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}