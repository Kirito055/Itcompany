package com.company;

import com.company.FirstDepartment.CompanyPhone;
import com.company.FirstDepartment.Manager;
import com.company.SecondDepartment.Application;
import com.company.SecondDepartment.Proger;
import com.company.ThirdDepartment.Tester;

import java.util.List;

public class Director {
    private final Proger proger= new Proger();
    private final Tester tester=new Tester();
    private final Manager manager=new Manager();
    private List<Employee> coworkers;
    private final Employee employee=new Employee();

    public Director(){

        }


    public void startProject(){

            manager.Answer();
            manager.DropCall();
            proger.work();
            tester.test();

    }





    public void stop(){
       proger.stop();
       tester.stop();
    }
}
