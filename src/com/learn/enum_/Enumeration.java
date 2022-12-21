package com.learn.enum_;

/**
 * @author HuAng
 */
public class Enumeration {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);

    }
}
class Season{
    private String name;
    private String desc;//描述

    //定义了四个对象 固定的
    public static final Season SPRING = new Season("春天", "鸟语花香");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "严寒");

    //构造器私有化 防止被new
    //去set方法 防止属性被改

    private Season(String name, String desc) {//构造器
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
   