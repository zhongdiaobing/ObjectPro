package com.imooc.array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a= {12,3,2,14,23,1,23,12,43};
        int tmp;
        System.out.println("未经过冒泡排序后的数组为：");
        for (int n:a){
            System.out.print(n+" ");
        }
        for (int i=0;i< a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        System.out.println();
        System.out.println("经过冒泡排序后的数组为：");
        for (int n:a){
            System.out.print(n+" ");
        }

    }
}
