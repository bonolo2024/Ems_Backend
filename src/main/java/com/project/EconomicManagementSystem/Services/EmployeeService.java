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
        try {
            return employeeRepository.findAllByAdminId(adminId);
        } catch (Exception e) {
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        try {
            return employeeRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        try {
            return employeeRepository.findById(employeeId);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String addEmployee(Employee employee) {
        try {
            employeeRepository.save(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Added successfully";
    }


    @Override
    public void updateEmployee(Employee employee) {
        try {
            Employee updatedEmployeeId = employeeRepository.findById(employee.getEmployeeId());

            if (updatedEmployeeId != null) {
                employee.setFirstname(employee.getFirstname() == null ? updatedEmployeeId.getFirstname() : employee.getFirstname());
                employee.setLastname(employee.getLastname() == null ? updatedEmployeeId.getLastname() : employee.getLastname());
                employee.setEmail(employee.getEmail() == null ? updatedEmployeeId.getEmail() : employee.getEmail());
                employee.setEmployeeNumber(employee.getEmployeeNumber() == null ? updatedEmployeeId.getEmployeeNumber() : employee.getEmployeeNumber());
                employee.setDepartment(employee.getDepartment() == null ? updatedEmployeeId.getDepartment() : employee.getDepartment());
                employee.setContacts(employee.getContacts() == null ? updatedEmployeeId.getContacts() : employee.getContacts());

                employeeRepository.save(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteEmployee(int employeeId) {
        try {
            employeeRepository.deleteById(employeeId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
