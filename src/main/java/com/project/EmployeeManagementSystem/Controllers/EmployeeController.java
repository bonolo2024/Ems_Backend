package com.project.EmployeeManagementSystem.Controllers;

import com.project.EmployeeManagementSystem.Interface.EmployeeInterface;
import com.project.EmployeeManagementSystem.Model.Employee;
import com.project.EmployeeManagementSystem.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @PutMapping("/{employeeId}")
//    @Override
    public void updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee) {
        employee.setEmployeeId(employeeId);
            employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{employeeId}")
    @Override
    public void deleteEmployee(@PathVariable ("employeeId") int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
