package com.imooc.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 求整型数组的累加和
        int[] a={1,2,4,5,6};
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum + a[i];
        }
        System.out.println("整型数组累加和为："+sum);
    }
}
