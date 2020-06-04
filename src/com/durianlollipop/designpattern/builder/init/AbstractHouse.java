package com.durianlollipop.designpattern.builder.init;

abstract class AbstractHouse {

    /**打地基*/
    abstract void buildBasic();

    /**砌墙*/
    abstract void buildWalls();

    /**封顶*/
    abstract void roofed();

    /**建造*/
    void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
