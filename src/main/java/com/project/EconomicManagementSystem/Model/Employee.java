package com.project.EconomicManagementSystem.Model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;


@Component
@Entity()
@Table(name="employees")
public class Employee {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="employeeid",nullable=false, unique=true)
    private int employeeId;

    private String firstname;
    private String lastname;

    @Column(name="employeenumber",nullable = false)
    private Integer employeeNumber;

    @Column(name="department",nullable = false)
    private String department;

    @Column(name="email")
    private String email;

    @Column(name="contacts")
    private Long contacts;

    @ManyToOne
    @JoinColumn(name="adminid", nullable=true)
    private Admin admin;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getContacts() {
        return contacts;
    }

    public void setContacts(Long contacts) {
        this.contacts = contacts;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", contacts=" + contacts +
                ", admin=" + admin +
                '}';
    }

    public Employee () {}
}
