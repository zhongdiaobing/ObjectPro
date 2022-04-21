package com.imooc.method;

public class MethodDemo3 {
    // 查找数组元素的值
    public boolean searchArr(int n,int[] arr){
        boolean result=false;
        for (int i:arr){
            if (i==n){
                result=true;break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        MethodDemo3 md=new MethodDemo3();
        int[] a={1,2,31,4};
        boolean result=md.searchArr(3,a);
        System.out.println(result);
        if (result){
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }
    }
}
