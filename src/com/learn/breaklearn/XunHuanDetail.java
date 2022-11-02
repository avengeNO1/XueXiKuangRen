package com.learn.breaklearn;

/**
 * @author HuAng
 */
public class XunHuanDetail {
    /*
     *打印 镂空三角
     *
     * 化繁为简
     * 1、打印半个三角
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     * 层数和星星对应
     * for (int i = 1;i <= 5;i++){//层数
           for (int j = 1;j <= i;j++){//
               System.out.print("*");
           }
           System.out.println();
       }
       * 2、打印整个三角
       *
     *         *
     *        ***
     *       *****
     *      *******
     *     *********
     * 3、镂空
     *
     *         *
     *        * *
     *       *   *
     *      *     *
     *     *********

    */
    public static void main(String[] args) {
        for (int i = 1;i <= 5;i++){//层数
            for (int k = 1;k <= 5-i;k++){
                System.out.print(" ");
            }
            for (int j = 1;j <= 2 * i- 1;j++){//
                if (j == 1 || j == 2 * i - 1 || i == 5 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

