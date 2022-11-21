package com.learn.fengzhuang;

/**
 * @author HuAng
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(3000);
        person.setSalary(300000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        //通过构造器修改了属性 可以绕过set，为了避免可以将set写在构造器中
       // Person person1 = new Person("smith",300,20000);
        // 导致info方法中的信息
        // 名字 = smith 年龄 = 25 薪水 = 20000.0
        //没办法得到保障

        Person person1 = new Person("smith",25,20000);
        System.out.println("===========修改后的信息==========");
        System.out.println(person1.info());


    }
}
class Person{
    public String name;
    private  int age;
    private  double salary;

    //构造器 初始化属性
    public Person() {

    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //保证验证有效
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //根据要求完善代码
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //验证
        if (name.length() >= 2 && name.length() <= 6 ){
            this.name = name;
        }else {
            System.out.println("名字范围须在2-6字符之间");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("年龄范围在1-120");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //返回属性信息
    public String info(){
        return "信息为 名字 = " + name +" 年龄 = " + age + " 薪水 = " + salary;
    }

}


   