package com.learn.debug;

import java.util.Arrays;

/**
 * @author HuAng
 */
public class Debug02 {
    public static void main(String[] args) {
        int [] arr = {123,54,-20,23,4,6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

   