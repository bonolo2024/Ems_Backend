package com.project.EconomicManagementSystem.Controllers;

import com.project.EconomicManagementSystem.Interface.EmployeeInterface;
import com.project.EconomicManagementSystem.Model.Employee;
import com.project.EconomicManagementSystem.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/employees")
public class EmployeeController implements EmployeeInterface {

    @Autowired
    public EmployeeService employeeService;


    //Does not get by Admin ID: FIX LATER
    @GetMapping("/adminEmp/{adminId}")
    @Override
    public List<Employee> getEmployeesByAdminId(@PathVariable int adminId) {
        return employeeService.getEmployeesByAdminId(adminId);
    }

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    @Override
    public Employee getEmployeeById(@PathVariable int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping("/add")
    @Override
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return null;
    }

    @PutMapping("/")
    @Override
    public String updateEmployee(@RequestBody Employee employee) {
            employeeService.updateEmployee(employee);
            return null;
    }

    @DeleteMapping("/{employeeId}")
    @Override
    public void deleteEmployee(@PathVariable ("employeeId") int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
