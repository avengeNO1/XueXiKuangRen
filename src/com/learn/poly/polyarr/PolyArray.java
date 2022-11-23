package com.learn.poly.polyarr;

/**
 * @author HuAng
 */
public class PolyArray {
    public static void main(String[] args) {
        //Person数组接收5个对象
        //一个person对象，两个student对象 两个teacher对象
        Person[] person = new Person[5];
        person[0] = new Person("玛丽亚",23);
        person[1] = new Student("Jack",16,98.2);
        person[2] = new Student("阿里",16,98.2);
        person[3] = new Teacher("老胡",40,20000);
        person[4] = new Teacher("老林",50,250000);
        //遍历输出调用say
        System.out.println("姓名 " + "\t年龄 ");
        for (int i = 0; i < person.length; i++){
            //person[i]编译类型是Person ，运行类型根据实际情况JVM进行判断
            System.out.println(person[i].say());//动态绑定机制
            if (person[i] instanceof Student){
//                Student student = (Student) person[i];//向下转型
//                student.study();
                ((Student)person[i]).study();
            }else if (person[i] instanceof Teacher){
                ((Teacher)person[i]).teach();
            }else if (person[i] instanceof Person){

            }else {
                System.out.println("错误");
            }
        }
    }
}

   