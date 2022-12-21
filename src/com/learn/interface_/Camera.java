package com.learn.interface_;

/**
 * @author HuAng
 */
public class Camera implements UsbInterface{

    @Override
    public void connection() {
        System.out.println("相机已连接");
    }

    @Override
    public void disconnection() {
        System.out.println("相机已断开连接");
    }
}

   