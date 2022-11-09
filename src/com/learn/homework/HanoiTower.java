package com.learn.homework;

/**
 * @author HuAng
 */
public class HanoiTower {

    //汉诺塔 递归
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(5, 'A', 'B', 'C');
    }
}
class Tower{
    //移动方法
    //num 盘子数 a,b,c -> A塔 B塔 C塔
    public void move(int num, char a, char b, char c){
        //只有一个盘
        if (num == 1){
            System.out.println(a+"->"+c);
        }else {//多个盘
            //先一移动上面所有的盘到b塔，借助c塔
            move(num - 1,a, c, b);
            //再将最下面的盘移动到c塔
            System.out.println(a+"->"+c);
            //最后将b塔上的盘移动到c塔，借助a塔
            move(num - 1,b, a, c);
        }
    }
}

   