package com.learn.poly.polyparamater;

/**
 * @author HuAng
 */
public class PolyParameter {//测试类
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 2500);
        Manger mary = new Manger("Mary", 20000, 2000000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(jack);//30000.0
        polyParameter.showEmpAnnual(mary);//2240000.0
        polyParameter.testWork(jack);
        polyParameter.testWork(mary);
        "ss".equals("ss");
    }

    //实现获取任何员工的年薪，并且在main方法中调用
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定
    }
    //testWork方法 如果是普通员工则调用work方法 如果是经理则调用manage方法
    //用instanceof比较符判断 对象e 的运行类型是否为 Worker类型或者Manger类型
    public void testWork(Employee e){
        if (e instanceof Worker){
            Worker worker = (Worker) e;//向下转型
            worker.work();
         // ((Worker) e).work();
        }else if (e instanceof Manger){
            ((Manger) e).manage();
        }else {
            System.out.println("错误");
        }
    }
}

   