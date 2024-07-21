package com.project.EconomicManagementSystem.Repository;

import com.project.EconomicManagementSystem.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Optional<Admin> findByEmail(String email);
//    public Admin login(String email, String password );

}
