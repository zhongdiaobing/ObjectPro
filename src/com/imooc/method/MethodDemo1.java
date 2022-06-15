package com.imooc.method;

public class MethodDemo1 {
    // 方法不能嵌套定义
    // 打印输出星号的方法--无参无返回值的方法
    public void printStar() {
        System.out.println("*****************");
    }

    // 无参带返回值的方法
    public int area() {
        int length = 12;
        int width = 2;
        return length * width;
    }

    // 带参无返回值的方法
    public void floatMax(float a, float b) {
        float max = a;
        if (b > max) {
            max = b;
        }
        System.out.println("这两个float类型数据的最大值为：" + max);
    }

    // 带参有返回值的方法-求阶乘的方法
    public int fac(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }

    public static void main(String[] args) {
        // 创建一个MethodDemo类的对象md
        MethodDemo1 md = new MethodDemo1();
        // 使用对象名.方法名()去调用方法。
        md.printStar();
        System.out.println("欢迎来到Java世界");
        md.printStar();
        System.out.println("长方形的面积为：" + md.area());
        md.floatMax(1.2f, 2.1f);
        System.out.println(md.fac(3));
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int fac = md.fac(i);
            sum = sum + fac;
        }
        System.out.println(sum);
    }

}
