package com.learn.abstract_.abstract_updata;

/**
 * @author HuAng
 */
public class BB extends CurrentTime {
    //统计1-80000的乘积


    @Override
    public void job() {//重写父类的job方法
        long num = 0;
        for (long i = 1; i <= 80000; i++) {
            num *= i;
        }
    }
}

   