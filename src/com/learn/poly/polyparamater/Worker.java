package com.learn.poly.polyparamater;

/**
 * @author HuAng
 */
public class Worker extends Employee {//普通员工
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println(getName()+"正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}

   