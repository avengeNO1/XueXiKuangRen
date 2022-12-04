package com.pro.houserent.service;

import com.pro.houserent.domain.House;

/**
 *
 * @author HuAng
 */
public class HouseService {
    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息，因为构造器中初始化了一个，所有初始保存为1
    private int idCount = 1;//记录当前id的增长情况，因为构造器中初始化了一个，所有初始保存为1

    //提供构造器初始化House[]
    public HouseService(int size) {
        houses = new House[size];
        //方便测试，给定一个初始化House对象
        houses[0] = new House(1, "jack", "123", "南城区", 3000, "未出租");
    }
    //find方法 返回House对象 或者null
    public House find(int findId){
        for (int i = 0; i < houseNums; i++){
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    //del方法，删除一个房屋信息，返回boolean
    public boolean del(int delId){//delId 要删除的id
        //通过房屋下标来确定
        int index = -1;
        for (int i = 0; i < houseNums; i++){
            if (delId == houses[i].getId()){//要删除的id就是数组house下标为i的元素id
                //比如要删除的delId为2，对应的下标为1
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < houseNums - 1; i++){
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    //add方法，把新的house对象加入到house数组，返回boolean
    public boolean add(House newHouse){
        //判断是否还有空间添加
        if (houseNums == houses.length){
            System.out.println("空间已满，不能再添加了");
            return false;
        }
        //将newHouse对象加入到 house[]
        //house[]的长度为houseNums
//        houses[houseNums] = newHouse;
//        houseNums++;
        houses[houseNums++] = newHouse;

        //id自增 将自增的信息更新
        newHouse.setId(++idCount);
        return true;
    }
    //list() 返回所有的房屋信息
    public House[] list(){
        return houses;
    }
}

   