package com.learn.enum_;

/**
 * @author HuAng
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}
enum Season02{
//    private String name;
//    private String desc;//描述

//    //定义了四个对象 固定的
//    public static final Season SPRING = new Season("春天", "鸟语花香");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
//    public static final Season WINTER = new Season("冬天", "严寒");

    //使用enum 实现枚举类
    /*
      1.使用enum关键字代替class
      2. 将public static final Season SPRING = new Season("春天", "鸟语花香");改
              SPRING("春天","鸟语花香"); 常量名(实参列表)
      3.如果有多个常量对象，使用 逗号,  分隔开
      4.如果使用enum关键字 要将常量对象置于前面

     */
    SPRING("春天","鸟语花香"),SUMMER("夏天", "炎热"),AUTUMN("秋天", "秋高气爽"),WINTER("冬天", "严寒");
    private String name;
    private String desc;//描述

    private Season02(String name, String desc) {//构造器
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

   