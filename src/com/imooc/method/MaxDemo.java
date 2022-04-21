package com.imooc.method;

public class MaxDemo {
    public void max(float a,float b){
        float max=a;
        if (max<b){
            max=b;
        }
        System.out.println("两个数的最大值为："+max);
    }
    public void max(double m,double n){
        double max=m;
        if (max<n){
            max=n;
        }
        System.out.println("两个数的最大值为："+max);
    }

    public static void main(String[] args) {
        MaxDemo mx=new MaxDemo();
        mx.max(2.3f,21);
        mx.max(2.1,3.4);
    }
}
