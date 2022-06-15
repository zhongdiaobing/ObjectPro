package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[][] intArray=new int[3][2];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("请输入第"+(i+1)+"个学生的语文成绩");
            intArray[i][0]=sc.nextInt();
            System.out.println("请输入第"+(i+1)+"个学生的数学成绩");
            intArray[i][1]=sc.nextInt();
        }
        int sumChinese=0,sumMaths=0;
        for (int i=0;i<intArray.length;i++){
//            for (int j=0;j<intArray[i].length;j++){
//                sumChinese+=intArray[i][0];
//                sumMaths+=intArray[i][1];
//            }
            sumChinese+=intArray[i][0];
            sumMaths+=intArray[i][1];
        }
        System.out.println("语文成绩的总分为："+sumChinese);
        System.out.println("数学成绩的总分为："+sumMaths);
    }
}
