package com.imooc.demo;

public class JieChenPlus {
    public static void main(String[] args) {
        int n=1;
        int p=1;
        int sum=0;
        while (n<=4){
            p=1;
            int m=1;
            while (m<=n){
                p=p*m;
                m++;
            }
            sum=sum+p;
            n++;
        }
        System.out.println(sum);
    }
}
