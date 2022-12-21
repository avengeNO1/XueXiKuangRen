package com.learn.interface_;

/**
 * @author HuAng
 */
public class Computer {
    //电脑工作相关方法
    public void work(UsbInterface usbInterface){
        usbInterface.connection();
        usbInterface.disconnection();
    }
}

   