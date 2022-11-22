package com.learn.poly;

/**
 * @author HuAng
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //对象的多态 统一管理喂食问题
    //animal 编译类型是Animal，可以指向（接收）Animal的子类的对象
    //food 编译类型是Food，可以指向（接收）Food 的子类的对象

    public void feed(Animal animal, Food food){
        System.out.println("主人 "+ name + " 给 " + animal.getName() + " 吃 " + food.getName() );

    }
//    //主人给狗喂食
//    public void feed(Dog dog, Bone bone){
//        System.out.println("主人 "+ name + " 给 " + dog.getName() + " 吃 " + bone.getName() );
//    }
//    //主人给猫喂食
//    public void feed(Cat cat,Fish fish ){
//        System.out.println("主人 "+ name + " 给 " + cat.getName() + " 吃 " + fish .getName());
//    }
}

   