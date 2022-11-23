package com.learn.poly;

/**
 * @author HuAng
 */
public class TestObj {
    public static void main(String[] args) {

        Person person1 = new Person("小明", 20, '男');
        Person person2 = new Person("小明", 20, '男');

        System.out.println(person1.equals(person2));

        Person p1 = person1;
        System.out.println(p1.equals(person1));
    }

}
class Person{
    private String name;
    private int age;
    private char gender;

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            Person p = (Person)obj;
            //return this.name.equals(p.name) && this.age == p.age && this.gender == gender;
            if (this.name.equals(p.name) && this.age == p.age && this.gender == gender){
                return true;
            }
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
   