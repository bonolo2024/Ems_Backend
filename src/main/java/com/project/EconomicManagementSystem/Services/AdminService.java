package com.project.EconomicManagementSystem.Services;

import com.project.EconomicManagementSystem.Interface.AdminAuthInterface;
import com.project.EconomicManagementSystem.Model.Admin;
import com.project.EconomicManagementSystem.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class AdminService {

    @Autowired
    public AdminRepository adminRepository;

////    @Override
//    public boolean login(String email, String password) {
//        Admin admin = adminRepository.findByEmail(email);
//
//        if (admin != null) {
//            return admin.getPassword().equals(password);
//        }
//        return false;
////        if (email != null) email = email.toLowerCase();
////        return adminRepository.login(email,password);
//    }

//    @Override
    public void register(Admin admin) {

        try {
            String email = admin.getEmail();
            Pattern pattern = Pattern.compile("^(.+)@(.+)$");

            if (email != null) email = email.toLowerCase();
            if (!pattern.matcher(email).matches()) {
                System.out.println("Invalid Email Format");
            } else {
                adminRepository.save(admin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
