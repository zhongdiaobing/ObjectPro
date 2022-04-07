package com.imooc.animal;

/**
 * 宠物猫类
 * @author user
 */
public class Cat {
    // 成员属性：昵称、年龄、体重、品种
    private String name;
    private int month;
    private double weight;      // 体重
    private String species;    // 品种

    // static：静态 静态成员 类成员
    public static int price;   // 售价
    //成员方法：跑、吃东西
    //跑的方法
    // 在成员方法中，可以直接访问类中静态成员
    public Cat(){
        System.out.println("我是宠物猫");
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName(){
        return "我是一只名叫"+this.name+"小猫咪";
    }

    public int getMonth() {
        return month;
    }


    public double getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public static void run(){

        System.out.println("小猫快跑");
    }
    public static void eat(){
//        静态方法中不能直接访问非静态成员，只能直接调用静态成员
        run();
        System.out.println("小猫吃鱼");
    }
}
