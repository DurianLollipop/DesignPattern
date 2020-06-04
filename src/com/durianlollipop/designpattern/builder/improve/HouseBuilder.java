package com.durianlollipop.designpattern.builder.improve;

/**
 * 抽象的建造者
 */
abstract class HouseBuilder {

    /** 房子*/
    House house = new House();

    /** 将建造流程写好，抽象的方法*/
    /** 打地基*/
    abstract void buildBasic();
    /** 砌墙*/
    abstract void buildWalls();
    /** 封顶*/
    abstract void roofed();

    /** 建造好房子， 将房子(产品)返回*/
    public House buildHouse(){
        return house;
    }
}
