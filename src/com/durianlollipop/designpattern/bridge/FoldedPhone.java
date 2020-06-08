package com.durianlollipop.designpattern.bridge;

class FoldedPhone extends Phone{
    /**
     * 构造器
     *
     * @param brand
     */
    FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
