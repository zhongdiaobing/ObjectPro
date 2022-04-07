package com.imooc.user;

public class Test {
    public static void main(String[] args) {
        User one=new User("Luck","123456");
        User two=new User("Mike","123456");
        UserManage um=new UserManage();
        one.info();
        two.info();
        System.out.println("============");
        System.out.println(um.checkUser(one,two));
    }
}
