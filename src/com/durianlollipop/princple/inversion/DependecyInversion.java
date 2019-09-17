package com.durianlollipop.princple.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello，word";
    }
}

//完成Persion接受消息得功能
//1、简单，容易想到
//2、如果是我们获取的对象是微信，短信等，则新增类，同时Persion页要增加相应的接收方
//3、解决思路：引入一个抽象的接口，表示一个接收者，这样Persion类与接口IReciver发生依赖
//   因为Email，微信等，等等属于接收的范围，他们各自实现IReceiver接口就OK,这样我们就符合依赖倒转原则
class Persion {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}