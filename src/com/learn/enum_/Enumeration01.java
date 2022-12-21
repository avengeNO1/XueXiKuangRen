//package com.learn.enum_;
//
///**
// * @author HuAng
// */
//public class Enumeration01 {
//    public static void main(String[] args) {
//        Season spring = new Season("春天", "鸟语花香");
//        Season summer = new Season("夏天", "炎热");
//        Season autumn = new Season("秋天", "秋高气爽");
//        Season winter = new Season("冬天", "严寒");
//
//        //季节只有春夏秋冬
//        //按照传统的方式定义季节类来创建对象 是没办法保证固定的四个对象
//        //因此需要一种方式来规定 所以引出  ===========》枚举类
//        Season other = new Season("QI", "WW");
//    }
//}
//class Season{
//    private String name;
//    private String desc;//描述
//
//    public Season(String name, String desc) {//构造器
//        this.name = name;
//        this.desc = desc;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//