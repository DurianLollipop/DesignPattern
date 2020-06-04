package com.durianlollipop.designpattern.builder.improve;

class CommonHouse extends HouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");
    }
}
