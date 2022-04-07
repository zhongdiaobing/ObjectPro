package com.imooc.monkey;

public class Test {
    public static void main(String[] args) {
        Monkey m=new Monkey();
        System.out.println("我是使用无参构造产生的猴子");
        System.out.println("名称："+m.name);
        System.out.println("特征："+m.feature);
        System.out.println("我是使用带参构造产生的猴子");
        Monkey mk=new Monkey();
        System.out.println("名称："+mk.name);
        System.out.println("特征："+mk.feature);
    }
}
