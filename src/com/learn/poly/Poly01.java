package com.learn.poly;

/**
 * @author HuAng
 */
public class Poly01 {
    public static void main(String[] args) {

//        System.out.println("=======传统方法======");
//        Master jack = new Master("JACK");
//        Dog dog = new Dog("旺财");
//        Bone bone = new Bone("大棒骨");
//        jack.feed(dog,bone);
//        Cat cat = new Cat("喵瞄");
//        Fish fish = new Fish("黄花鱼");
//        jack.feed(cat,fish);
        System.out.println("=========多态的实现========");
        Master jack = new Master("JACK");
        Pig pig = new Pig("小花猪");
        Food food = new Food("米饭");
        jack.feed(pig,food);
    }
}

   