package com.durianlollipop.princple.inversion;

public class DependencyPass {
    public static void main(String[] args) {
        //方式一
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new ChangHong());

        //方式二
        OpenAndClose1 openAndClose1 = new OpenAndClose1(new ChangHong());
        openAndClose1.open();

        //方式三
        OpenAandClose3 openAndClose2 = new OpenAandClose3();
        openAndClose2.setTv(new ChangHong());
        openAndClose2.open();
    }
}

//方式一：通过接口传递实现依赖
//开关的接口
interface IOpenAndClose {
    //抽象方法，接收接口
    void open(ITV tv);
}

//ITV接口
interface ITV {
    void play();
}

//ITV具体实现
class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("打开长虹电视");
    }
}

//控制电视的具体是实现类
class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

//方式二，通过构造方法进行依赖传递
interface IOpenAndClose1 {
    void open();
}

class OpenAndClose1 implements IOpenAndClose1 {

    public ITV tv;

    //构造方法
    OpenAndClose1(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

//方式三:通过setter方法传递
class OpenAandClose3 implements IOpenAndClose1 {

    public ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}