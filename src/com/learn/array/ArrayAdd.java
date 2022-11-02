package com.learn.array;

import java.util.Scanner;

/**
 * @author HuAng
 */
public class ArrayAdd {
    /*
    数组扩容
     */
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int [] arr = {1,2,3};
        do {
            int [] arrNew = new int[arr.length + 1];//创建新的数组长度加一
            for (int i = 0;i < arr.length;i++){//遍历数组，将arr的元素传递给arrNew
                arrNew[i] = arr[i];
            }
            System.out.println("请添加新元素");
            arrNew[arrNew.length-1] = myScanner.nextInt();//赋给addNew最后一个数
            arr = arrNew;//让arr指向arrNew

            for (int i = 0;i < arr.length;i++){
                System.out.print(arr[i] +"\t");
            }
            System.out.println("是否继续添加 y/n");
            if (myScanner.next().charAt(0) == 'n'){
                break;
            }

        }while (true);
        System.out.println("退出");
    }
}


   