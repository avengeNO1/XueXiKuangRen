package com.learn.interface_;

/**
 * 当子类继承了父类就自动拥有了父类的功能
 * 如果子类需要扩展功能可以通过接口的实现来扩展
 * @author HuAng
 */
public class TestAbstract {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("六耳猕猴");
        littleMonkey.climbing();
        littleMonkey.flying();
        littleMonkey.Swimming();
    }
}
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }
    public void climbing(){
        System.out.println(this.getName()+ "在爬树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
interface FishAble{
     void Swimming();
}
interface BirdAble{
    public void flying();
}
class LittleMonkey extends Monkey implements FishAble,BirdAble{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void Swimming() {
        System.out.println(this.getName() + "学会了游泳");
    }

    @Override
    public void flying() {
        System.out.println(this.getName() + "学会了飞行");
    }
}