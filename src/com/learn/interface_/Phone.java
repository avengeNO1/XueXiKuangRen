package com.learn.interface_;

/**
 * @author HuAng
 */
public class Phone implements UsbInterface {

    @Override
    public void connection() {
        System.out.println("手机已连接");
    }

    @Override
    public void disconnection() {
        System.out.println("手机已断开连接");
    }
}

   