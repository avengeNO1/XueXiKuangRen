package com.learn.enum_;

/**
 *
 * Enum 类的常用方法
 * @author HuAng
 *
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season02 枚举类 来演示各种方法
        Season02 autumn = Season02.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal 输出的是该枚举对象的次序/编号 从0开始
        //AUTUMN 枚举对象是第三个 输出2
        System.out.println(autumn.ordinal());
        //values 返回的是Season02[]
        //含有定义的所有枚举对象
        Season02[] values = Season02.values();
        System.out.println("=====遍历取出枚举对象 =====");
        for(Season02 season02:values){//增强for循环
            System.out.println(season02);
        }
        //valueOf 将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程
        /*
          1.根据输入的AUTUMN 到 Season02的枚举对象去查找
          2.如果找到了，就返回，如果没有找到，就报错
         */
        Season02 autumn1 = Season02.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1);
      //  Season02 autumn2 = Season02.valueOf("HSH");//No enum constant com.learn.enum_.Season02.HSH

        //compareTO 比较两个枚举常量 比较的是编号
        //Season02.AUTUMN的编号 - Season02.SUMMER的编号 2-1
        System.out.println(Season02.AUTUMN.compareTo(Season02.SUMMER));
//        //增强for循环演示
//        int[] num = {1, 2, 5};
//        for (int i:num) {//依次从num数组中取出数据 赋给i ，如果取出完毕则退出for循环
//            System.out.println("i = " + i);
//        }
//        //普通for循环
//        System.out.println("=============");
//        for (int i = 0; i < num.length; i++){
//            System.out.println(num[i]);
//        }
    }
}

   