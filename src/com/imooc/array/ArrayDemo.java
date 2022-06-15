package com.imooc.array;

public class ArrayDemo {
    public static void main(String[] args) {
        // 声明一个整型数组
        int[] intArray;
        // 声明一个字符串数组
        String strArray[];
        // 创建数组
        intArray=new int[5];
        strArray=new String[10];
        // 声明数组的同时进行创建
        float[] floatArray=new float[4];
        // 初始化数组
        char[] ch={'a','b','c','d'};
        System.out.println("数组的长度为："+ch.length);
        System.out.println(intArray[2]);
        System.out.println(strArray[4]);
        System.out.println(floatArray[3]);
    }
}
