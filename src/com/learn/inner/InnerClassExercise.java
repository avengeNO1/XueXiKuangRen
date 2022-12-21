package com.learn.inner;

/**
 * 当作实参传递
 *
 * @author HuAng
 */
public class InnerClassExercise {
    public static void main(String[] args) {
        //当作实参传入
        show(new AA() {
            @Override
            public void cry() {
                System.out.println("这是声音");
            }
        });
        //传统
        //new Tiger().cry();
        show(new Tiger());
    }

    //静态方法 接口类型的形参
    public static void show(AA aa) {
        aa.cry();
    }
}

//接口
interface AA {
    void cry();
}

//写一个类实现 接口（传统）
class Tiger implements AA {

    @Override
    public void cry() {
        System.out.println("老虎在吼>>>");
    }
}