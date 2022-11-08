package com.learn.homework;

/**
 * @author HuAng
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        T t = new T();
        int n = 3;
        int res = t.fibonacci(n);
        if (res != -1){
            System.out.println("当前位置的斐波那契数是： " + res);
        }
      // int res = t.fibonacci(-1);
       // System.out.println("当前位置的斐波那契数是： " + res);

        int dayMath = 1 ;
        int resPeach = t.peach(dayMath);
        if (resPeach != -1){
            System.out.println("第"+dayMath+"天有"+resPeach+"个桃子");
        }
    }
}
class T{

    //斐波那契数
    public int fibonacci(int n ){
        if (n >= 1){
            if (n == 1 || n == 2){
                return 1;
            }else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }else {
            System.out.println("要求输入大于等于1的数");
            return -1;
        }
    }

    //猴子吃桃
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (peach(day + 1) + 1) * 2;//这一天的桃子 = (后一天的桃子 +1) * 2
        }else {
            System.out.println("day范围错误");
            return -1;
        }
    }
}

   