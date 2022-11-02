package com.learn.array;

import java.util.Scanner;

/**
 * @author HuAng
 */
public class SeqSearch {
    /**
     * 顺序查找
     * @param args
     */
    public static void main(String[] args) {
        String[] name = {"jack","may","max","kay"};

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名称：");

        String myName = myScanner.next();

        int findName = -1;
        for (int i = 0;i < name.length;i++){
            if (myName.equals(name[i])){
                System.out.println("恭喜你找到了"+myName);
                System.out.println("下标为："+i);
                //如果找到了 把i保存到findName
                findName = i;
                break;
            }
        }
        if (findName == -1){//没有找到
            System.out.println("没有找到"+myName);
        }
    }
}

   