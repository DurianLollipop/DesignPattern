package com.durianlollipop.designpattern.bridge;

abstract class Phone {

    /** 组合品牌 */
    private Brand brand;

    /** 构造器 */
    Phone(Brand brand){
        this.brand = brand;
    }

    void open(){
        this.brand.open();
    }

    void close(){
        this.brand.close();
    }

    void call(){
        this.brand.call();
    }

}
