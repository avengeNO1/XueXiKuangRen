package com.learn.abstract_.abstract_test;

/**
 * @author HuAng
 */
public class BB {
    //统计1-800000的乘积
    long num = 0;//
    public void job(){

        for (long i = 1; i <= 800000; i++) {
            num *= i;
        }

    }

    //抽取共同部分
    public void currentTime(){
        //开始时间
        long start = System.currentTimeMillis();
        job();
        //结束
        long end = System.currentTimeMillis();
        System.out.println("执行时间: " +  (end - start));
    }
}



   