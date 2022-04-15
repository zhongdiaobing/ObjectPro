package com.imooc.demo;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        // 设置要猜的数
        int number=(int)(Math.random()*10+1); // 使用随机数生成1到10之间的整数
        int guess;
        System.out.println("猜一个介于1-10之间的数字");
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("请输入您猜测的数");
            guess=sc.nextInt();
            if (guess>number){
                System.out.println("太大了");
            }else if (guess<number){
                System.out.println("太小了");
            }
        }while (number!=guess);
        System.out.println("恭喜你，猜中了！");
    }
}
