package com.learn.poly.poly_test;

/**
 * @author HuAng
 */
public class Animal {
    public String name;
    protected  int age;
    String color;
    private String address;

    public void eat(){
        System.out.println("吃饭了");
    }
    public void run(){
        System.out.println("跑");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void show(){
        System.out.println("你好");
    }
//    public Animal() {
//    }
//
//    public Animal(String name, int age, String color, String address) {
//        this.name = name;
//        this.age = age;
//        this.color = color;
//        this.address = address;
//    }
}

   