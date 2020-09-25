package com.company.ThirdDepartment;

import com.company.Employee;
import com.company.SecondDepartment.Application;

public class Tester extends Employee {
    Application application=new Application();
    public Tester(){
    }
    public Tester(String name, int salary, String position) {
        super(name, salary, "Tester");
    }

    public void test(){
        application.run();
        System.out.println("Start Test");
    }


    public void stop(){
        application.off();
        System.out.println("Tester stop test");
    }
}
