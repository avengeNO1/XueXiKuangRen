package com.learn.abstract_.abstract_test;

/**
 * 模板设计模式
 * @author HuAng
 */
public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.currentTime();
        BB bb = new BB();
      //  bb.job();
        bb.currentTime();
    }
}

   