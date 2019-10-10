package com.durianlollipop.designpattern.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "宋江";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("大白","小白");


        //方式一 clone完成深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.clone();

        System.out.println(deepProtoType.name+deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType1.name+deepProtoType1.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType2.name+deepProtoType2.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType3.name+deepProtoType3.deepCloneableTarget.hashCode());

        //方式二 序列化/反序列化完成深拷贝
        DeepProtoType deepProtoType4 = (DeepProtoType) deepProtoType.deppClone();
        DeepProtoType deepProtoType5 = (DeepProtoType) deepProtoType.deppClone();
        DeepProtoType deepProtoType6 = (DeepProtoType) deepProtoType.deppClone();

        System.out.println(deepProtoType.name+deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType4.name+deepProtoType4.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType5.name+deepProtoType5.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType6.name+deepProtoType6.deepCloneableTarget.hashCode());
    }


}
