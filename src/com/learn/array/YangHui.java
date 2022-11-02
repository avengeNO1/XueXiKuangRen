package com.learn.array;

/**
 * @author HuAng
 */
public class YangHui {
    public static void main(String[] args) {
        /**
         * 杨辉三角
         */
        int [][] yangHui = new int[12][];//确认行数
        for (int i = 0;i < yangHui.length;i++){//遍历yangHui的一维数组

            yangHui[i] = new int[i + 1];//开辟空间

            for (int j = 0;j < yangHui[i].length;j++){//给一维数组赋值
                if (j == 0 || j == yangHui[i].length -1){
                    yangHui[i][j] = 1;
                }else {
                    yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
                }
            }
        }
        //遍历输出
        for (int i = 0;i < yangHui.length;i++){
            for (int j = 0;j < yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }


    }
}

   