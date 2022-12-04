package com.pro.houserent.view;

import com.pro.houserent.domain.House;
import com.pro.houserent.service.HouseService;
import com.pro.houserent.util.Utility;

/**
 * @author HuAng
 */
public class HouseView {
    HouseService houseService = new HouseService(2);

    //updateHouse()更新 接收用户输入的id
    public void updateHouse(){
        System.out.println("============修改房屋信息============");
        System.out.println("请选择修改房屋编号（-1退出）：");
        int upDateId = Utility.readInt();
        if (upDateId == -1){
            System.out.println("============放弃修改房屋信息============");
            return;
        }
        //根据输入得到updateId,直接查找对象
        //返回的是引用类型 数组
        //所以当house.setxx()时，会修改HouseService中的house数组的元素
        House house =  houseService.find(upDateId);
        if (house == null){
            System.out.println("修改房屋编号不存在");
            return;
        }
        System.out.println("姓名（" + house.getName() + ")：");
        String name = Utility.readString(8,"");//用户直接回车表示不修改信息，默认""
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.println("电话（" + house.getPhone() + ")：");
        String phone = Utility.readString(12,"");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.println("地址（" + house.getAddress() + ")：");
        String address = Utility.readString(16,"");
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.println("房租（" + house.getRent() + ")：");
        int rent = Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }
        System.out.println("状态（" + house.getState() + ")：");
        String state = Utility.readString(3,"");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("============修改房屋信息成功============");
    }

    //findHouse() 界面 接收用户输入id 根据id查找房屋信息
    public void findHouse(){
        System.out.println("============查找房屋信息============");
        System.out.println("请输入你要查找的id：");
        int findId = Utility.readInt();
        House house = houseService.find(findId);
        if (house != null){
            System.out.println(house);
        }else {
            System.out.println("============查找房屋id信息不存在============");        }
    }

    //退出
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    //编写delHouse()方法接收输入的id 调用
    public void delHouse(){
        System.out.println("============删除房屋信息============");
        System.out.println("请选择删除的房屋编号（-1退出）：");
        int delID = Utility.readInt();
        if (delID == -1){
            System.out.println("============放弃删除房屋信息============");
            return;//结束方法
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.del(delID) ){
                System.out.println("============删除房屋信息成功============");
            }else {
                System.out.println("============房屋不存在，删除失败============");
            }
        }else {
            System.out.println("============放弃删除房屋============");
        }
    }

    //addHouse()接收用户输入
    public void addHouse(){
        System.out.println("============添加房屋============");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(已出租/未出租)：");
        String state = Utility.readString(3);
        //House对象接收以上信息 但是id是自增的
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("============添加房屋成功===========");
        }else{
            System.out.println("============添加房屋失败===========");
        }

    }

    //listHouse()显示房屋列表
    public void listHouse(){
        System.out.println("============房屋列表============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(已出租/未出租)");
        House[] houses = houseService.list();//得到所有的房屋信息
        for (int i = 0; i < houses.length; i++){
            if (houses[i] == null){//如果为null，就不要显示了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("============显示房屋列表完成============");
    }
    //显示主菜单
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户的选择
    public void mainMenu(){//显示主菜单
        do {
            System.out.println("\n============房屋出租系统菜单============");
            System.out.println("\t\t1 新 增 房 源");
            System.out.println("\t\t2 查 找 房 屋");
            System.out.println("\t\t3 删 除 房 屋");
            System.out.println("\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t5 展 示 房 屋 信 息");
            System.out.println("\t\t6 退        出");
            System.out.println("请输入你的选择（1-6）");
            key = Utility.readChar();
            switch (key){
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    findHouse();
                    break;
                case '3' :
                    delHouse();
                    break;
                case '4' :
                    updateHouse();
                    break;
                case '5' :
                    listHouse();
                    break;
                case '6' :
                    exit();
                    loop = false;
                    break;
            }
        }while (loop);
    }
}

   