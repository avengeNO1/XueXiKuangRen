package com.learn.inner;

/**
 * @author HuAng
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
      /*
        1.有一个铃声Bell，里面有一个ring方法。
        2.有一个手机类Cellphone 具有闹钟过功能alarmClock，参数是Bell类型
        3.测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印：懒猪起床了
        4.再传入另一个匿名内部类(对象)，打印:上课了！
      */
        Cellphone cellphone = new Cellphone();
        //传递的是实现了Bell接口的匿名内部类
        //匿名内部类 重写了ring方法
        //Bell bell = new Bell() { //bell的编译类型是 Bell 运行类型是匿名内部类
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了");
        //            }
        //        }
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了!");
            }
        });
    }
}

interface Bell {
    void ring();
}

class Cellphone {
    public  void alarmClock(Bell bell) {//接口类型的形参 Bell
        System.out.println(bell.getClass());//查看匿名内部类
        bell.ring();//动态绑定
    }
}

   