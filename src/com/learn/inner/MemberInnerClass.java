package com.learn.inner;

/**
 * @author HuAng
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.test();

        //外部其它类，使用成员内部类的2种方式
        //1.相当于把new Inner04()当作Inner04的成员
        Outer04.Inner04 inner04 = outer04.new Inner04();
        inner04.say();
        //2.在外部类中，编写一个方法 可以返回Inner04对象
        Outer04.Inner04 inner04Instance = outer04.getInner04Instance();
        inner04.say();

    }
}
class Outer04{
    private int n1 = 100;
    public String name = "阿三";
    private void ok(){
        System.out.println("Outer 的ok（）");
    }

    class Inner04{
        private double sal = 22.2;
        public void say(){
            //直接访问
            System.out.println("n1 = " + n1 + " name = " + name);
            ok();
        }
    }
    //返回Inner04对象
    public Inner04 getInner04Instance(){
        return new Inner04();
    }
    public void test(){
        //使用成员内部类
        //创建成员内部类的对象 ，然后使用相关的方法
        Inner04 inner04 = new Inner04();
        inner04.say();
        System.out.println(inner04.sal);
    }
}
   