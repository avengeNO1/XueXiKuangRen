package com.learn.poly.polyparamater;

/**
 * @author HuAng
 */
public class Employee {//员工类
    private String name;
    private double salary;

    public double getAnnual(){
        return salary * 12;
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

   