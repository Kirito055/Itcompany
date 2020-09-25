package com.company;

import com.company.FirstDepartment.Manager;
import com.company.SecondDepartment.Proger;
import com.company.ThirdDepartment.Tester;

public class Main {

    public static void main(String[] args) {

        Employee employee1=new Manager("David",42500,"Manager");
        Employee employee2=new Proger("Qwe",100500,"Proger");
        Employee employee3=new Proger("Asd",95500,"Proger");
        Employee employee4=new Proger("Zxc",128500,"Proger");
        Employee employee5=new Tester("Noobmaster123",70500,"Tester");
        Employee employee6=new Tester("go1vs1noob",60500,"Tester");
        Employee employee7=new Tester("Clown",75500,"Tester");
    employee1.addCoworker(employee2);
    employee1.addCoworker(employee3);
    employee1.addCoworker(employee4);
    employee1.addCoworker(employee5);
    employee1.addCoworker(employee6);
    employee1.addCoworker(employee7);
        Director director=new Director();
        director.startProject();
    }
}
