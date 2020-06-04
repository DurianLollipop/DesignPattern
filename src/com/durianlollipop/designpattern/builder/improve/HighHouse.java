package com.durianlollipop.designpattern.builder.improve;

/** 具体建造者*/
class HighHouse extends HouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    void roofed() {
        System.out.println("高楼透明屋顶");
    }
}
