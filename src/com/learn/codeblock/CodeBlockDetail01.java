package com.learn.codeblock;

/**
 * @author HuAng
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类什么时候被加载
        //1.创建对象实例的时候
        //new AA();//AA的静态代码块被执行


        //2.创建子类对象实例时，父类也会被加载
        //父类先 然后子类
        //new BB();
        //AA的静态代码块被执行
        //BB的静态代码块被执行

        //3.创建类的静态成员时
        //System.out.println(CC.age);
        //CC的静态代码块被执行
        //999
    }
}
class CC{
    public static int age = 999;
    static {
        System.out.println("CC的静态代码块被执行 ");
    };
}
class AA {
    static {
        System.out.println("AA的静态代码块被执行 ");
    };
}

class BB extends AA {
    static {
        System.out.println("BB的静态代码块被执行 ");
    };
}