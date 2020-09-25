package com.company.SecondDepartment;

import com.company.Employee;

public class Proger extends Employee {
    Application application = new Application();
    public Proger(){}
    public Proger(String name, int salary, String position) {
        super(name, salary, "Proger");
    }

    public void work(){
        application.run();
        System.out.println("Proger  start work");
    }

    public void stop(){
        application.off();
        System.out.println("Proger stop work");
    }
}
