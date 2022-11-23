package com.learn.poly.polyparamater;

/**
 * @author HuAng
 */
public class Manger extends Employee {
    private double bonus;
    //构造器
    public Manger(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manage(){
        System.out.println(getName() + "正在管理");
    }

}

   