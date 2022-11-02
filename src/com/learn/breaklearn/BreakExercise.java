package com.learn.breaklearn;

import java.util.Scanner;

/**
 * @author HuAng
 */
public class BreakExercise {

    public static void main(String[] args) {
        /**
         * 需求：
         * 1、实现登录验证，有三次机会，如果用户名为丁真 密码为666提示登录成功，
         * 否则提示还有几次机会。
         * 思路
         * 1、创建Scanner 接收对象
         * 2、初始化String name String password
         * 3、循环三次登录验证，信息对的上登陆成功，跳出循环
         * 4、对不上提示还剩多少次 int chance
         */
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String password = "";
        int chance = 3;

        for (int i = 1;i <= 3;i++ ){
            System.out.println("请输入用户名：");
            name = myScanner.next();
            System.out.println("请输入密码：");
            password = myScanner.next();
            if ("丁真".equals(name) && "666".equals(password)){
                System.out.println("登录成功");
                break;
            }
            chance--;
            System.out.println("还剩"+chance+"次机会");
        }

    }
}

   