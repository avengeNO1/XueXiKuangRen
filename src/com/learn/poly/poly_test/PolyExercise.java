package com.learn.poly.poly_test;

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
        cat.catchMouse();


        //要求父类的引用必须指向的是当前目标类型的对象
      //  Dog dog = (Dog) animal;//运行报错


    }
}

   