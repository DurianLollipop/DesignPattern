package com.durianlollipop.designpattern.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    /** String 属性*/
    public String name;
    /** 引用类型*/
    public DeepCloneableTarget deepCloneableTarget;


    /**
     * 深拷贝 - 方式一：使用clone方法实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        //对引用类型属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    /**
     * 深拷贝 - 方式二：通过对象序列化实现深拷贝(推荐)
     * @return
     */
    public Object deppClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType deepProtoType = (DeepProtoType) ois.readObject();
            return deepProtoType;
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
