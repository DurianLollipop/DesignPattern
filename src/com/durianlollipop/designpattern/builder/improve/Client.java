package com.durianlollipop.designpattern.builder.improve;

class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子，返回产品(普通房子)
        House common = houseDirector.constructHouse();

        System.out.println("-------------------------");
        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        House high = houseDirector.constructHouse();
    }
}
