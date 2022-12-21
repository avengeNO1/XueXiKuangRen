package com.learn.abstract_;

/**
 * @author HuAng
 */
public class Manager extends Employee {
    private double bonus;//奖金

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("经理 " + getName() + "在工作");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

   