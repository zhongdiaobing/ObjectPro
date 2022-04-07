package com.imooc.user;

public class User {
    //定义属性用户名、密码
    private String userName;
    private String passWord;
    // 构造函数初始化属性值
    public User(String userName,String passWord){
        this.setUserName(userName);
        this.setPassWord(passWord);
    }
    // get和set方法
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void info(){
        System.out.println("用户名："+userName);
        System.out.println("密码："+passWord);
    }
}
