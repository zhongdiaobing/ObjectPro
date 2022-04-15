package com.imooc.demo;

public class StarDemo {
    public static void main(String[] args) {
        int m=1;
        int n=1;
        while (m<=4){
            n=1;
            while (n<=4){
                System.out.print("*");
                n++;
            }
            System.out.println();
            m++;
        }
    }
}
