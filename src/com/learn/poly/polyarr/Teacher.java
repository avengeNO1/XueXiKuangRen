package com.learn.poly.polyarr;

/**
 * @author HuAng
 */
public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + " 薪水 " + salary ;
    }
    public void teach(){
        System.out.println("老师 " + getName() + " 在教书 ");
    }
}




   