package com.learn.debug;

/**
 * @author HuAng
 */
public class Debug03 {
    public static void main(String[] args) {//创建对象的流程
        //1、加载Person类信息Debug Alt shift F7
        //2、初始化 2.1 默认初始化 2.2 显式初始化 2.3 构造器初始化
        //3、返回对象地址
        Person jack = new Person("jack", 20);

        System.out.println(jack);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


   