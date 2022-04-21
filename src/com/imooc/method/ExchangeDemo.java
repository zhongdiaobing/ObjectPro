package com.imooc.method;

public class ExchangeDemo {
    public void swap(int a,int b){
        System.out.println("交换前：a="+a+" 交换前：b="+b);
        int tmp=a;
        a=b;
        b=tmp;
        System.out.println("交换后：a="+a+" 交换后：b="+b);
    }
    public void swapTest(){
        int m=3,n=4;
        swap(m,n);
    }
    public static void main(String[] args) {

        ExchangeDemo ed=new ExchangeDemo();
        ed.swapTest();
    }
}
