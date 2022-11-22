package com.learn.poly.objpoly;

/**
 * @author HuAng
 */
public class PolyObject {
    public static void main(String[] args) {
        //对象多态特点
        //animal 编译类型 Animal 运行类型 Dog
        Animal animal = new Dog();
        //因为运行时，这时就执行到该行时，animal运行类型是Dog
        animal.cry();
        //animal 编译类型(在定义的时候就已经确定了)Animal 运行类型 Cat
        animal = new Cat();
        animal.cry();
    }
}

   