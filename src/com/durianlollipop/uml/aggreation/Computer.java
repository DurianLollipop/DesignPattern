package com.durianlollipop.uml.aggreation;

public class Computer {
    //显示器可以和电脑分离
    private Moniter moniter;
    //鼠标可以和电脑分离
    private Mouser mouser;

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
