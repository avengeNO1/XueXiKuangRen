package com.learn.extend;

/**
 * @author HuAng
 */
//小学生 模拟考试情况

public class Pupil {
    public String name;
    public int age;
    private double score;

    public Pupil(String name, int age) {//添加构造器
        this.name = name;
        this.age = age;

    }

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("学生名 " + name + " 正在考数学 ");
    }
    public void showInfo(){
        System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}

   