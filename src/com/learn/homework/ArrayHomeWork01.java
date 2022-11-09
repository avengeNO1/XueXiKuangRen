package com.learn.homework;

/**
 * @author HuAng
 */
public class ArrayHomeWork01 {
    public static void main(String[] args) {
        //1.定位 2.扩容
        int [] arr = {10, 12, 45, 90};
        int insetNum = 111;
        int index = -1;//需要插入位置

        //遍历arr ，如果发现insetNum <= arr[i],说明i就是要插入额位置
        //使用index 保留 index = i；
        //如果遍历后，没有发现insetNum <= arr[i]， index = arr.length
        //
        for (int i = 0; i < arr.length; i++){
            if (insetNum <= arr[i]){
                index = i;
                break;//找到就退出，不然继续匹配。
            }
        }
        if (index == -1){
            index = arr.length;
        }
        System.out.println("index = "+index);
        //扩容
        /*
          将arr元素拷贝到arr2 ，并且跳过 index 的位置
          i控制arr2的下标 j控制arr的下标
         */
        int [] arr2 = new int [arr.length + 1];//创建arr2 长度加一

        for (int i = 0, j = 0; i < arr2.length; i++){
            if ( i != index){//把 arr元素拷贝到 arr2
                arr2[i] = arr[j];
                j++;
            }else {//i这个位置就是要插入的数
                arr2[i] = insetNum;
            }
        }
        arr = arr2;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


   