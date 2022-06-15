package com.imooc.method;

import java.rmi.server.UnicastRemoteObject;

public class AveDemo {
    public void aveArr(float[] a){
        float sum=0;
        for (float n:a){
            sum+=n;
        }
        float ave=sum/a.length;
        System.out.println("数组元素的平均值为："+ave);
    }

    public static void main(String[] args) {
        AveDemo ad=new AveDemo();
        float[] arr={12.3f,12.1f,11.5f,3.1f};
        ad.aveArr(arr);
    }
}
