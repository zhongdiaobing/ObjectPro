package com.imooc.method;

import java.util.Scanner;

public class DataManage {
    /**
     * 从键盘接收数据
     * @return 接收数据
     */
    public int[] insertData(){
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        // 少接收一个数据，为在指定位置处插入数据做准备
        for (int i=0;i<a.length-1;i++){
            System.out.println("请输入"+(i+1)+"个数据");
            a[i]=sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        DataManage dm=new DataManage();
        dm.insertData();
    }
}
