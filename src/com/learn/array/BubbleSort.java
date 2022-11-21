package com.learn.array;

/**
 * @author HuAng
 */
public class BubbleSort {
    /**
     *
     冒泡排序
     */
    public static void main(String[] args) {
        int [] arr = {12,34,54,11,2,5,23};
        int temp = 0;
        for (int i = 0;i < arr.length-1;i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.println("\n第"+ (i+1)+"轮");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

    }


}

   