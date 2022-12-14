package com.learn.abstract_.abstract_updata;

/**
 * @author HuAng
 */
public abstract class CurrentTime {
    //抽象方法job
    public abstract void job();
    //抽取共同部分
    public void currentTime() {
        //开始时间
        long start = System.currentTimeMillis();
        job();//动态绑定

        //结束
        long end = System.currentTimeMillis();
        System.out.println("执行时间: " + (end - start));
    }
}


   