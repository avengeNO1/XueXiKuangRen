package com.learn.array;

/**
 * @author HuAng
 */
public class TestWork {
    /**
     * 某人有100,000元，没经过一次路口，需要交费，规则如下：
     * 1、当现金 > 50000时，每次加5%。
     * 2、当现金 <= 50000时，每次交1000
     * 计算该人可以通过多少次路口，需求使用while break实现
     *
     * 思路：
     * 1.有100,000元 double money = 100,000；
     * 2.当现金 > 50000时，每次加5%。
     * while（money > 50000） money = money - （mmoney*0.5）；
     * 3.当现金 <= 50000时，每次交1000
     * while（money >= 1000 && money > 50000） money = money - 1000；
     * 4.当 money < 1000;退出
     *
     * 5.通过多少次路口 int count = 0；
     * count ++；
     *
     */
//    public static void main(String[] args) {
//        double money = 100000; //还剩多少钱
//        int count = 0;//累计路口
//        while (true){//循环
//            if (money > 50000){//过路口
//             //   money = money - money * 0.05;
//                money *= 0.95;//过了路口还剩多少钱
//                count++;//
//            }else if ( money >= 1000){
//                money -= 1000;//过了路口还剩多少钱
//                count++;
//            }else {//钱不够1000了
//                System.out.println("钱不够");
//                break;
//            }
//        }
//        System.out.println("100000可以过"+count+"路口");
//    }
    public static void main(String[] args) {
        /**
         * 出票系统
         * 4-10月 旺季
         *  成人（18-60）：60
         *  儿童（<18）: 半价
         *  老人（>60）: 1/3
         *
         *  淡季
         *  成人（18-60）：40
         * 儿童（<18）: 20
         * 思路：
         *
         *1、12个月 分淡旺季 if-else
         * 2、旺季三种情况 多分支
         * 3、淡季双分支
         *
         *
         *
         */
        int month = 1;
        int age = 40;
        if (month >=4 && month <= 10 ){
            if (age >=18 && age <60){
                System.out.println("旺季成人票价60");
            }else if (age < 18){
                System.out.println("旺季成人票价30");
            }else {
                System.out.println("旺季老人票价20");
            }
        }else{
            if (age >=18 && age <60){
                System.out.println("淡季成人票价40");
            }else {
                System.out.println("票价20");
            }

        }
    }
}

   