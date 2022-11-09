package com.learn.homework;

/**
 * @author HuAng
 */
public class MiGongGame {
    //迷宫游戏

    /**
     * 初始地图
     *   0 1 2 3 4 5 6
     * 0 1 1 1 1 1 1 1
     * 1 1 0 0 0 0 0 1
     * 2 1 0 0 0 0 0 1
     * 3 1 1 1 0 0 0 1
     * 4 1 0 0 0 0 0 1
     * 5 1 0 0 0 0 0 1
     * 6 1 0 0 0 0 0 1
     * 7 1 1 1 1 1 1 1
     */
    public static void main(String[] args) {
        int [][] map = new int[8][7];//创建迷宫空间
        //规定map中 1为障碍物 0为可以走的路
        //给空间赋值 最上面和最下面一行 设为1
        for (int i = 0; i < 7; i++ ){

            map[0][i] = 1;
            map[7][i] = 1;
        }
        //最左边和最右边的一列 设为1
        for (int i = 0; i < 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //遍历 打印初始地图
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }

        Game game = new Game();
        game.findWay(map,1, 1);
        System.out.println("=======================");
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
class Game{
    //findWay方法 map 地图 i,j是初始位置
    //规定 1为障碍物 0为可以走的路 2为可以走且通过 3走过的但不通
    //map[6][5] = 2说明已经走通 返回true 否则 false
    //确定走路的策略 下 ->右 ->上 ->左
    public boolean findWay(int[][] map, int i, int j){
        if (map[6][5] == 2){// 已经找到
            return true;
        }else {
            if (map[i][j] == 0){//当前的位置为0，是可以走的
                //假设走的通
                map[i][j] = 2;
                //走路的策略 下 ->右 ->上 ->左
                if (findWay(map,i -1, j)){//向下走
                    return true;
                }else if (findWay(map, i, j + 1)){//向右走
                    return true;
                }else if (findWay(map, i - 1, j )){//向上走
                    return true;
                }else if (findWay(map, i +1, j)){//向下走
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {//map[i][j] = 1,2,3
                return false;
            }
        }
    }

}

   