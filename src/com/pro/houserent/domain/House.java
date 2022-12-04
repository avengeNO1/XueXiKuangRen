package com.pro.houserent.domain;

/**
 * House 表示一个房屋信息
 * @author HuAng
 */
public class House {
    //属性
    // 编号 id ，房主 name，电话 phone，地址 address，月租 rent，状态 state(未出租/已出租)
    private int id;
    private String name;
    private String phone;
    private String address;
    private int rent;
    private String state;

    //构造器 getter setter

    public House(int id, String name, String phone, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //方便输出对象信息

    @Override
    public String toString() {
        return  id +
                "\t\t\t" + name  +
                "\t\t" + phone +
                "\t\t\t" + address  +
                "\t\t" + rent +
                "\t\t" + state ;
    }
}

   