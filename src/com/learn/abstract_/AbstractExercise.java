package com.learn.abstract_;



/**
 * @author HuAng
 */
public class AbstractExercise {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 1011, 5000);
        jack.setBonus(100000);
        jack.work();

        Worker mary = new Worker("mary", 1022, 1000);
        mary.work();
    }
}

   