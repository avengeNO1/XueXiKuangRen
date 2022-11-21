package com.learn.extend.improve_;

/**  
 * @author HuAng
 */
public class Test {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "熊猫";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(66);
        pupil.showInfo();
        System.out.println("===============");
        Graduate graduate = new Graduate();
        graduate.name = "大熊猫";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}

