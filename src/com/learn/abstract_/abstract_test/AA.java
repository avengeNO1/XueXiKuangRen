package com.learn.abstract_.abstract_test;

/**
 * @author HuAng
 */
public class AA {
    //统计1-80000的和
    long num = 0;//
    public void job(){
//        //开始时间
//        long start = System.currentTimeMillis();
        for (long i = 1; i <= 80000; i++) {
            num += i;
        }
        //结束
//        long end = System.currentTimeMillis();
//        System.out.println("执行时间: " +  (end - start));
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

   