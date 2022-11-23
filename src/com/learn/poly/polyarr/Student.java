package com.learn.poly.polyarr;

/**
 * @author HuAng
 */
public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }


    @Override
    public String say() {
        return super.say() + " 成绩 " + score;
    }
    public void study(){
        System.out.println("学生 " + getName() + " 在学习 ");
    }
}

   