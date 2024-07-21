package com.project.EconomicManagementSystem.Services;

import com.project.EconomicManagementSystem.Interface.EmployeeInterface;
import com.project.EconomicManagementSystem.Model.Employee;
import com.project.EconomicManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeInterface {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeesByAdminId(int adminId) {
        return employeeRepository.findAllByAdminId(adminId);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Added successfully";
    }


    @Override
    public String updateEmployee(Employee employee) {
        Employee updatedEmployeeId = employeeRepository.findById(employee.getEmployeeId());

        if (updatedEmployeeId != null) {
            employee.setFirstname(employee.getFirstname() == null ? updatedEmployeeId.getFirstname() : employee.getFirstname());
            employee.setLastname(employee.getLastname() == null ? updatedEmployeeId.getLastname() : employee.getLastname());
            employee.setEmail(employee.getEmail() == null ? updatedEmployeeId.getEmail() : employee.getEmail());
            employee.setEmployeeNumber(employee.getEmployeeNumber() == null ? updatedEmployeeId.getEmployeeNumber() : employee.getEmployeeNumber());
            employee.setDepartment(employee.getDepartment() == null ? updatedEmployeeId.getDepartment() : employee.getDepartment());
            employee.setContacts(employee.getContacts() == null ? updatedEmployeeId.getContacts() : employee.getContacts());

            employeeRepository.save(employee);
            return "Updated Successfully";
        } else {
            return "This Employee does not exist";
        }
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
