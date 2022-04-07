package com.imooc.animal;

public class CatTest {
    public static void main(String[] args) {
        // 对象实例化
        Cat one=new Cat();
        // 测试
        one.setName("凡凡");
        one.setMonth(3);
        one.setWeight(23.2);
        one.setSpecies("中华田园猫");
        System.out.println("昵称 "+one.getName());
        System.out.println("年龄 "+one.getMonth());
        System.out.println("体重 "+one.getWeight());
        System.out.println("品种 "+one.getSpecies());
    }
}
