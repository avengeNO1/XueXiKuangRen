package com.learn.extend;

/**
 * @author HuAng
 */
public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("熊猫",10);
//        pupil.name = "熊猫";
//        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("===============");
        Graduate graduate = new Graduate("大熊猫",22);
//        graduate.name = "大熊猫";
//        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}

   