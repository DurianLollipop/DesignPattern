package com.durianlollipop.designpattern.builder.improve;

/** 指挥者*/
class HouseDirector {

    HouseBuilder houseBuilder = null;

    /**
     * 构造器传入 HouseBuilder
     * @param houseBuilder
     */
    HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过setter方法 传入 houseBuilder.
     *
     * @param houseBuilder houseBuilder
     * @return this
     */
    public HouseDirector setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
        return this;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
