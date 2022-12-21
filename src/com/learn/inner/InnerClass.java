package com.learn.inner;

/**
 * @author HuAng
 */
public class InnerClass {
    public static void main(String[] args) {

    }
}
class Outer{//外部类
    private int n1 = 10;//属性

    public Outer(int n1) {//构造器
        this.n1 = n1;
    }
    public void m1(){//方法
        System.out.println("方法");
    }
    {//代码块
        System.out.println("代码块");
    }
    class Inner{//内部类

    }
}

   