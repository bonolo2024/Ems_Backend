package com.project.EmployeeManagementSystem.Interface;

import com.project.EmployeeManagementSystem.Model.Employee;

import java.util.List;

public interface EmployeeInterface {

    public List<Employee> getEmployeesByAdminId( int adminId);

    public Employee getEmployeeById(int employeeId);

    public String addEmployee(Employee employee);

//    public void updateEmployee(int employeeId, Employee employee);

    public void deleteEmployee(int employeeId);

}
