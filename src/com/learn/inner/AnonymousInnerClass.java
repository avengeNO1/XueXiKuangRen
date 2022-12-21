package com.learn.inner;

import com.learn.poly.Fish;

/**
 * 匿名内部类的使用
 *
 * @author HuAng
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.method();
    }
}

class Outer3 {//外部类
    //私有成员
    private int n1 = 100;

    public void method() {
        //基于接口的匿名内部类
    /*
    需求 使用接口IA 并创建对象
    传统： 写一个类 实现该接口 并创建对象
     */
//      IA tiger = new Tiger();
//      tiger.cry();

      /*
        因为可能只是使用一次Tiger类 每次使用都要创建类，则浪费资源
        所以使用匿名内部类 进行简化

        tiger 编译类型 IA
              运行类型 匿名内部类

       jdk底层在创建匿名内部类Outer3$1 立即就创建了 Outer3$1实例 并且把地址
       返回给tiger

       匿名内部类使用一次就不能在使用了
       */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎在吼");
            }
        };
        System.out.println("tiger 的运行类型 " + tiger.getClass());//Outer3$1
        tiger.cry();

        //基于类的匿名内部类
        /*
        father 编译类型 Father
               运行类型 Outer3$2
         */
        Father father = new Father("jack") {

        };
        System.out.println("father的 运行类型" + father.getClass());
        father.test();
    }

}

interface IA {
    public void cry();
}

//class Tiger implements IA{
//
//    @Override
//    public void cry() {
//        System.out.println("老虎在吼");
//    }
//}
class Father {
    public Father(String name) {

    }

    public void test() {
        System.out.println("父亲在教育儿子");
    }
}
   