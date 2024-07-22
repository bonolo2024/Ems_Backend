package com.project.EmployeeManagementSystem.Model;


import jakarta.persistence.*;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Table(name="admin")
@Entity()
public class Admin {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="adminid",nullable=false, unique=true)
    private Integer id;

    @Column(name="email",nullable=false, unique=true)
    private String email;

    @Column(name="password",nullable=false)
    private String password;

    @Column(name="firstname" ,nullable = false)
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy="admin")
    private List<Employee> employees = new ArrayList<>();


    //GETTERS AND SETTERS

    public int getAdminId() {
        return id;
    }

    public void setAdminId(int adminId) {
        this.id = adminId;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public String setPassword(String password) {
        return this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String setFirstname(String firstname) {
        return this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
