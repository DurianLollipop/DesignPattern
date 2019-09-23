package com.durianlollipop.uml.composition;

public class Computer {
    //显示器可以和电脑不可分离，同时生成，同时销毁
    private Moniter moniter = new Moniter();
    //鼠标可以和电脑分离，同时生成，同时销毁
    private Mouser mouser = new Mouser();

    public Moniter getMoniter() {
        return moniter;
    }

    public void setMoniter(Moniter moniter) {
        this.moniter = moniter;
    }

    public Mouser getMouser() {
        return mouser;
    }

    public void setMouser(Mouser mouser) {
        this.mouser = mouser;
    }
}
