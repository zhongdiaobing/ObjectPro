package com.imooc.array;

public class ArrayDemo2 {
    // 定义一个用于修改某个数组元素值的方法
    public void updateArray(int[] a){
        a[3]=15;
        System.out.println("数组a的元素为：");
        for (int n:a){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={12,21,32,3};
        ArrayDemo2 ad=new ArrayDemo2();
        ad.updateArray(arr);
    }
}
