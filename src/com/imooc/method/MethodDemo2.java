package com.imooc.method;

public class MethodDemo2 {
    // 打印输出数组元素的值
    public void printArr(int[] arr){
        for (int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MethodDemo2 md=new MethodDemo2();
        int[] a={12,32,12};
        md.printArr(a);
    }
}
