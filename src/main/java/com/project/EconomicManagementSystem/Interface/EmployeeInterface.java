package com.project.EconomicManagementSystem.Interface;

import com.project.EconomicManagementSystem.Model.Admin;
import com.project.EconomicManagementSystem.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeInterface {

    public List<Employee> getEmployeesByAdminId( int adminId);

    public Employee getEmployeeById(int employeeId);

    public String addEmployee(Employee employee);

    public String updateEmployee(Employee employee);

    public void deleteEmployee(int employeeId);

}
