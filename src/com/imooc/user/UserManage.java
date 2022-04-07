package com.imooc.user;

public class UserManage {
    // 信息验证方法
    public String checkUser(User one,User two){
        //判断用户名是否为空，是否一致
        String a1=one.getUserName();
        String a2=two.getUserName();
        String b1=one.getPassWord();
        String b2=two.getPassWord();
        if(a1.equals(a2)&b1.equals(b2)){
            return "用户信息一致";
        }else
            return "用户信息不一致";
    }
}
