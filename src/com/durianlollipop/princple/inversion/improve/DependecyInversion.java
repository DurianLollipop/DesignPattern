package com.durianlollipop.princple.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());
        persion.receive(new WeiXin());
    }
}

//定义接口
interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{
    @Override
    public String getInfo() {
        return "电子邮件信息：hello，email";
    }
}

class WeiXin implements IReceiver{
    @Override
    public String getInfo() {
        return "微信信息：hello，微信";
    }
}


//方式二
class Persion {
    //依赖抽象而不依赖细节
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}