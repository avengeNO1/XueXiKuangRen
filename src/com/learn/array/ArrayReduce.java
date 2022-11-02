package com.learn.array;

import java.util.Scanner;

/**
 * @author HuAng
 */
public class ArrayReduce {
    /*
    有一个数组{1，2，3，4，5}，进行缩减，提示用户是否继续缩减，
    每次缩减最后那个元素，当只剩下最后一个元素，提示不能在缩减。
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        do {
            int[] arrNew = new int[arr.length - 1];//创建新数组 长度减一
            //遍历arr数组，依次将arr的元素拷贝到arrNew中
            for (int i = 0; i < arr.length - 1; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("缩减的元素是："+arr[arr.length-1]);
            arr = arrNew;
            System.out.println("arr缩减后的值为：");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            if (arr.length == 1){
                System.out.println("最后一个元素了，不能在进行缩减了");
                break;
            }
            System.out.println("是否继续缩减 y/n");
            if (myScanner.next().charAt(0) == 'n'){
                break;
            }
        }while (true);
        System.out.println("退出");
    }
}



