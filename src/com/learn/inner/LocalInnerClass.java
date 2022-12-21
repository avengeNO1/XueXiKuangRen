package com.learn.inner;

/**
 * 内部类的使用
 *
 * @author HuAng
 */
public class LocalInnerClass {
    //演示
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m1();
    }
}

class Outer2 {//外部类
    //私有属性
    private int n1 = 10;

    private void m2() {
        System.out.println("Outer2 m2()");
    }

    public void m1() {//m1()是Inner2内部类的作用域
        final class Inner2 {//局部内部类

            public void f1() {
                System.out.println("n1 = " + n1);
                m2();
            }
        }
        Inner2 inner2 = new Inner2();
        inner2.f1();
    }
}

   