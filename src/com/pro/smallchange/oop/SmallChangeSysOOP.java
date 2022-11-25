package com.pro.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author HuAng
 * //1.显示菜单，并可以选择菜单，给出对应提示
 *     //2.完成零钱通明细
 *     //3.完成收益入账
 *     //4.消费
 *     //5.退出
 *     //改进
 *     //6.用户输入4 退出时，给出提示“你确定要退出吗”y/n 必须输入正确的y/n
 *     //否则循环输入指令，直到输入y/n
 *     //7.在收益入账和消费的时候，判断金额是否合理，并且给出相应的提示
 */

public class SmallChangeSysOOP {
    //1.显示菜单，并可以选择菜单，给出对应提示
    //定义相关的变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    // 2.完成零钱通明细
        /*
          实现方式：
          1.可以把收益入账和消费，保存在数组
          2.使用对象
          3.使用字符串拼接
       */
    String details = "-----------------零钱通菜单-----------------";

    //3.完成收益入账 （根据完成功能驱动程序员增加新的变化和代码）
    //  思路
    // 定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null;//Date 是java.util.Data类型 表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式

    //4.消费
    //定义新变量，保存消费的详情
    String note = "";



    //1.显示菜单,并可以选择菜单
    public void mainMenu(){
        do {
            System.out.println("\n=================选择零钱通菜单=================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退      出");
            System.out.println("请选择（1-4）：");
            key = scanner.next();

            //使用switch 分支结构控制
            switch (key){
                case "1" :
                   this.detail();
                    break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                   this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        }while (loop);
    }
    //2.完成零钱通明细
    public void detail(){
        System.out.println(details);
    }
    //收益入账
    public void income(){
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        //money 的值的范围应该进行校验
        //思路： 找出不正确的金额的条件，然后给出提示 直接break
        if (money <= 0){
            System.out.println("收益入账金额范围应该大于0");
            return;//退出方法，不再执行后面的方法
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前日期

        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;

    }
    //消费
    public void pay(){
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        // money 的值的范围应该进行校验
        //找出消费金额不正确的
        if (money <= 0 || money > balance){
            System.out.println("消费金额不对 应该在 0 - " + balance);
            return;
        }

        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;

        //拼接消费信息到details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    //退出
    public void exit(){
        //6.用户输入4 退出时，给出提示“你确定要退出吗”y/n 必须输入正确的y/n
        //否则循环输入指令，直到输入y/n
        //思路
        //1.定义一个变量chose ,接收用户的输入
        //2、使用while - break，来处理接收到的输入时 y / n
        //3.退出while 后 再判断choice 是y还是n 就可以决定退出
        String choice = "";
        while (true){//要求用户必须输入y/n，否则一直循环
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        //当用户退出while 进行判断
        if (choice.equals("y")){
            loop = false;
        }
    }
}

   