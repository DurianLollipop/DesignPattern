package com.durianlollipop.designpattern.builder.improve;

/** 产品Product*/
class House {

    /** 打地基*/
    private String basic;

    /** 砌墙*/
    private String wall;

    /** 封顶*/
    private String roofed;

    /**
     * Gets the value of basic.
     *
     * @return the value of basic
     */
    public String getBasic() {
        return basic;
    }

    /**
     * Sets the basic.
     *
     * @param basic basic
     * @return this
     */
    public House setBasic(String basic) {
        this.basic = basic;
        return this;
    }

    /**
     * Gets the value of wall.
     *
     * @return the value of wall
     */
    public String getWall() {
        return wall;
    }

    /**
     * Sets the wall.
     *
     * @param wall wall
     * @return this
     */
    public House setWall(String wall) {
        this.wall = wall;
        return this;
    }

    /**
     * Gets the value of roofed.
     *
     * @return the value of roofed
     */
    public String getRoofed() {
        return roofed;
    }

    /**
     * Sets the roofed.
     *
     * @param roofed roofed
     * @return this
     */
    public House setRoofed(String roofed) {
        this.roofed = roofed;
        return this;
    }
}
