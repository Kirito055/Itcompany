package com.company.FirstDepartment;

import com.company.Employee;

import java.util.List;

public class Manager extends Employee {

    private CompanyPhone phone = new CompanyPhone();
    public Manager(){}
    public Manager(String name, int salary, String position) {
        super(name, salary, "Manager");
    }

    public void Answer(){
        phone.getCall();
        System.out.println("Call accepted");
    }
    public void DropCall(){
        System.out.println("Call dropped");
    }
}
