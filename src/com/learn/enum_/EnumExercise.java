package com.learn.enum_;

/**
 * 练习
 *
 * @author HuAng
 */
public class EnumExercise {
    public static void main(String[] args) {
        Week[] weeks = Week.values();

        System.out.println("==所有星期的信息如下==");
        for (Week name:weeks) {
            System.out.println(name);
        }
    }
}

enum Week {
    //定义七个Week
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

    private String name;

    public String getName() {
        return name;
    }

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
   