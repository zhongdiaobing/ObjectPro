package com.imooc.demo;

public class JieChenPlus2 {
    public static void main(String[] args) {
        int s=1;
        int sum=0;
        for(int i=1;i<=10;i++){
            s=1;
            for (int j=1;j<=i;j++){
                s=s*j;
            }
            sum=sum+s;
        }
        System.out.println(sum);
        int[] a=new int[3];
        System.out.println(a);
        System.out.println(a[0]);
    }
}
