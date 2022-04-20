package com.imooc.array;

import java.util.Scanner;

public class TravelDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] travel = new String[5];
        for (int i=0;i<travel.length;i++){
            System.out.println("请输入第"+(i+1)+"个旅游地点");
            travel[i]=sc.next();
        }
        System.out.println("以下地方供旅游参考：");
        for (String str:travel){
            System.out.print(str+"  ");
        }
        System.out.println();
        System.out.print("随机生成的旅游目的地为： "+travel[(int)(Math.random()*5)]);
    }
}
