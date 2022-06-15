package com.imooc.method;

/**
 * 关于可变参数列表和重载的问题
 * @author zhongdb
 * @version 1.0
 */
public class ArgsDemo3 {
//    带可变参数列表的方法是最后被访问的
    public int plus(int a,int b){
        System.out.println("不带可变参数列表的方法别调用");
        return a+b;
    }
    public int plus(int... a){
        System.out.println("带可变参数列表的方法别调用");
        int sum=0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArgsDemo3 ad=new ArgsDemo3();
        System.out.println(ad.plus(1));
    }
}
