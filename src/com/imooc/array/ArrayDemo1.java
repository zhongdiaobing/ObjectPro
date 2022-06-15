package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 求整型数组的累加和
        System.out.println("请输入数组值：");
        Scanner sc=new Scanner(System.in);
        float[] a=new float[5];
        for (int i=0;i<5;i++){
            a[i]=sc.nextFloat();
            System.out.println(a[i]+" ");
        }
        float sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum + a[i];
        }
        System.out.println("整型数组累加和为："+sum);
    }
}
