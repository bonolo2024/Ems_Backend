package com.project.EmployeeManagementSystem.Interface;

import com.project.EmployeeManagementSystem.Model.Admin;
import org.springframework.http.ResponseEntity;

public interface AdminAuthInterface {

//    public boolean login(String email, String password );
 public ResponseEntity<Admin> register(Admin admin);
}
