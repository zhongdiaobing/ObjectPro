package com.imooc.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 求数组元素的最大值
        int[] a={12,1,32,11,3};
        int max=a[0];
        for (int n:a){
            if(n>max){
                max=n;
            }
        }
        System.out.println("数组元素的最大值为："+max);
    }
}
