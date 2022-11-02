package com.learn.array;

/**
 * @author HuAng
 */
public class ArrayExercise {
    /*
      创建一个char类型的26个元素的数组，分别放置'A'-'Z'
      使用for循环打印所有元素。
      思路
      1，声明char类型的数组
      2,放置元素
     因为  'A'+1 ='B'
     chars[i] = (char) ('A' + i);
   */
//       public static void main(String[] args) {
//
//         char [] chars = new char[26];
//         for (int i = 0;i < chars.length;i++) {//循环26次
//             chars[i] = (char) ('A' + i);
//             System.out.print(chars[i]+" ");
//         }
//
//    }

    /*
        请求出一个数组int[]的最大值{4，-1，9，10，23}，并得到对应的下标
        思路分析
        1、定义一个数组 int [] num ={4,-1,9,10,3};
        2、假设 max = num[0] 是最大值 ,maxIndex = 0
        3、从下标1遍历数组 如果max < 当前元素,说明max不是最大值，这时就将max = 当前的元素;
           maxIndex = 当前元素下标
        4、当遍历这个数组num 的时候，max就是最大值 maxIndex就是最大值对应下标
        */
    public static void main(String[] args) {
        int [] num ={4,-1,9,10,3};
        int max =  num[0];
        int maxIndex = 0;

        for (int i = 1;i < num.length;i++){//从下标1 开始遍历
            if (max < num[i]){
                max = num[i];
                maxIndex = i;
            }
        }
        System.out.println("max= "+max+"maxIndex="+maxIndex);
    }


}

