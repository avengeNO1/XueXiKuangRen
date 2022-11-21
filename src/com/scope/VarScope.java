package com.scope;

/**
 * @author HuAng
 */
public class VarScope {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cry();
    }
}
class Cat{
    //全局变量: 也就是属性，作用域为整个类体。
    //属性定义时可以直接赋值
    int age = 10;

    //全局变量(属性)可以不赋值，直接使用，因为有默认值
    double weight;//默认 0.0
    // 局部变量必须赋值后才能使用，因为没有默认值。
//    public void hi(){
//        int num;
//        System.out.println("num ="+ num);//报错Variable 'num' might not have been initialized
//    }

    public void cry(){
        //局部变量一般指的成员方法中定义的变量
        //n，name 局部变量 作用域都在cry方法中
        int n = 10;
        String name = "jack";
        System.out.println("在cry方法中使用属性 age="+age);
    }
    public void eat(){
        System.out.println("在eat方法中使用属性 age = "+age);
     //   System.out.println("在eat中使用cry变量name ="+name);//错误

    }
}

   