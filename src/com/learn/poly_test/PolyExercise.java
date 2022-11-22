package com.learn.poly_test;

/**
 * @author HuAng
 */
public class PolyExercise {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Cat();

        animal.eat();
        animal.run();
        animal.sleep();
        animal.show();
        //向下转型
        Cat cat = (Cat) animal;
        ((Cat) animal).catchMouse();

    }
}

   