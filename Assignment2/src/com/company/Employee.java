package com.company;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private long ID;
    private String name;
    private int salary;
    private String position;
    private List<Employee> coworkers;
    public long getID() {
        return ID;
    }
    public Employee(){

    }
    public Employee(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        coworkers =new ArrayList<Employee>();
    }
    public void addCoworker(Employee employee){
        coworkers.add(employee);
    }
    public void removeCoworker(Employee employee){
        coworkers.remove(employee);
    }
    public  List<Employee> getCoworkers(){
        return coworkers;
    }
    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
