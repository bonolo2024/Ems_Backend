package com.project.EconomicManagementSystem.Interface;

import com.project.EconomicManagementSystem.Model.Admin;
import org.springframework.http.ResponseEntity;

public interface AdminAuthInterface {

//    public boolean login(String email, String password );
 public ResponseEntity<Admin> register(Admin admin);
}
