package com.imooc.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // 二位数组的声明
        // 三种形式
        // 声明int类型的二维数组
        int[][] intArray;
        // 声明float类型的二维数组
        float floatArray[][];
        // 声明double类型的二维数组
        double[] doubleArray[];
        // 创建二维数组
        // 创建一个三行三列的int类型的数组
        intArray = new int[3][3];
        System.out.println(intArray[2][1]);
        // 为第二行第三个元素赋值为9
        intArray[1][2] = 9;
        System.out.println("第二行第三列的元素为：" + intArray[1][2]);
        // 声明数组的同时进行创建
//        二维数组在创建对象时可以省略列的数量，而不能省略行的数量
        char[][] ch = new char[3][5];
        // 创建float类型的数组时，只指定行数
        floatArray = new float[3][];
//        System.out.println(floatArray[0][0]);
        // 每行相当于一个一维数组，需要创建
        floatArray[0] = new float[3];
        floatArray[1] = new float[4];
        floatArray[2] = new float[5];
        System.out.println(floatArray[0][0]);
//        二维数组初始化问题
        int[][] num={{1,2,3},{4,5,6,9},{7,8,9}};
        System.out.println("num数组第1行第2列的元素为："+num[0][1]);
        System.out.println(num.length);
        System.out.println(num[1].length);
        System.out.println("输出二维码数组的值");
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
