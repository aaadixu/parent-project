package com.atguigu.design.creation.builder;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 9:41
 */
public class CommonHouseBuilder extends AbstractHouseBuilder{

    public CommonHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasic(String baise) {
        house.setBaise(baise);
        System.out.println("普通房子打地基 5米");
    }

    @Override
    public void buildWalls(String walls) {
        house.setWall(walls);
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed(String type) {
        house.setRoofed(type);
        System.out.println("普通房子屋顶");
    }
}
