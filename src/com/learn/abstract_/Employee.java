package com.learn.abstract_;

/**
 * @author HuAng
 */
abstract public  class Employee {
    //属性
    private String name;
    private int id;
    private double salary;

    //构造器
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //抽象的work()
    public abstract void work();
}



   