package com.durianlollipop.designpattern.bridge;

class Client {

    public static void main(String[] args) {
        //获取折叠样式手机
        System.out.println("--------------------小米折叠屏手机----------------------");
        Phone foldedXiaomi = new FoldedPhone(new XiaoMi());
        foldedXiaomi.open();
        foldedXiaomi.close();
        foldedXiaomi.call();

        System.out.println("--------------------Vivo折叠屏手机----------------------");
        Phone foldedVivo = new FoldedPhone(new Vivo());
        foldedVivo.open();
        foldedVivo.close();
        foldedVivo.call();

        System.out.println("--------------------小米直板手机----------------------");
        Phone upRightXiaoMi = new UpRightPhone(new XiaoMi());
        upRightXiaoMi.open();
        upRightXiaoMi.close();
        upRightXiaoMi.call();

        System.out.println("--------------------Vivo直板手机----------------------");
        Phone upRightVivo = new UpRightPhone(new Vivo());
        upRightVivo.open();
        upRightVivo.close();
        upRightVivo.call();
    }
}