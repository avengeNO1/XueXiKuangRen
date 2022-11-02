package com.learn.array;

/**
 * @author HuAng
 */
public class ArrayReverse {
    public static void main(String[] args) {
        /*
        数组反转

         */

        //找规律
        int [] arr = {11,22,33,44,55,66};
        int temp = 0;
        for (int i = 0;i < arr.length / 2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = temp;
        }
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\n==========================");
        //逆序遍历
        int [] arr1 = {11, 22, 33, 44, 55, 66};
        int [] arr2 = new int[arr1.length];//创建arr2大小与arr1相等。
        //逆序遍历arr1，增加循环变量j 0-->5 ，将arr1 的元素拷贝到arr2中
        for (int i = arr.length - 1,j = 0;i >= 0;i--,j++){
            arr2[j] = arr1[i];
        }
        arr1 = arr2;
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}

