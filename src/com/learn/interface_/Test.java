package com.learn.interface_;

/**
 * @author HuAng
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();
        Camera camera = new Camera();
        computer.work(camera);
        computer.work(phone);
    }
}

   