package com.learn.interface_;

/**
 *
 * @author HuAng
 */
public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组 接口类型数组
        UsbInterface_[] usbs = new UsbInterface_[2];
        usbs[0] = new Phone_();
        usbs[1] = new Cream_();
        for (int i = 0; i < usbs.length ; i++) {
            usbs[i].work();//动态绑定
            //进行向下转型 instanceof 判断的是运行类型
            if (usbs[i] instanceof Phone_){
//                Phone_ us = (Phone_) usbs[i];
//                us.callPhone();
                ((Phone_) usbs[i]).callPhone();
            }
        }
    }
}
interface UsbInterface_{//usb接口 有一个work()方法
    void work();
}
class Phone_ implements UsbInterface_{
    public void callPhone(){
        System.out.println("打电话...");
    }
    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class Cream_ implements UsbInterface_{

    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}
