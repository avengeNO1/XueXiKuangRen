package com.learn.final_;

/**
 * @author HuAng
 */
public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积 = " + circle.cirArea());
    }
}
class  Circle{
    private double radius;
    //1.定义时
    private final double PI ;//= 3.14;

    //2.在构造器中
    public Circle(double radius) {
        this.radius = radius;

        //PI = 3.14
    }
    //3、代码块中
    {
        PI = 3.14;
    }
    public double cirArea(){
        return PI * radius * radius;
    }
}

   