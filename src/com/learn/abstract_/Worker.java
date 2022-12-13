package com.learn.abstract_;

/**
 * @author HuAng
 */
public class Worker extends Employee{
    public Worker(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工 " + getName() + "在工作");
    }
}

   