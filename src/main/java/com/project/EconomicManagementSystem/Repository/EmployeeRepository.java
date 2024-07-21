package com.project.EconomicManagementSystem.Repository;

import com.project.EconomicManagementSystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByAdminId(int adminId);

    public Employee findById(int employeeId);

}
