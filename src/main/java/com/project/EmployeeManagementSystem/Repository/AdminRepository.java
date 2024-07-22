package com.project.EmployeeManagementSystem.Repository;

import com.project.EmployeeManagementSystem.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
