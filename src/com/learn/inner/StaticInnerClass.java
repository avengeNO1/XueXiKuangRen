package com.learn.inner;

/**静态内部类
 * @author HuAng
 */
public class StaticInnerClass {
    public static void main(String[] args) {

        Outer05 outer05 = new Outer05();
        outer05.m1();
        System.out.println("==================");
        //外部其他类访问静态内部类的2种方式
        //1.因为是静态内部类 是可以通过类名直接访问
        Outer05.Inner05 inner05 = new Outer05.Inner05();
        inner05.say();
        System.out.println("==================");
        //2.编写一个方法 返回静态内部类的对象实例
        Outer05.Inner05 inner051 = outer05.getInner05();
        inner051.say();
    }
}
class Outer05{//外部类
    private int n1 = 10;
    private static String name = "Mary";
    static void m2(){
        System.out.println("静态方法 m2");
    }
    static class Inner05{//内部类 相当于静态成员
        public void say(){
            System.out.println(name);
            //System.out.println(n1);错误Non-static field 'n1' cannot be referenced from a static context
            m2();
        }

    }
    public void m1(){
        Inner05 inner05 = new Inner05();
        inner05.say();
    }

    //返回Inner05的对象实例
    public Inner05 getInner05(){
        return new Inner05();
    }
}
   