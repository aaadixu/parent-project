package com.atguigu.design.creation.builder;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 9:40
 */
public abstract class AbstractHouseBuilder {
    protected House house;
    //将建造的流程写好，抽象的方法
    public abstract void buildBasic(String baise);

    public abstract void buildWalls(String walls);

    public abstract void roofed(String roof);

    //建造房子后，将产品（房子）返回
    public House builder() {
        return house;
    }
}
