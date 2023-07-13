package com.atguigu.design.creation.builder;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 9:33
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractHouseBuilder builder = new CommonHouseBuilder();

        builder.buildBasic("aaa");
        builder.buildWalls("vvv");
        builder.roofed("sss");
        House builder1 = builder.builder();
        System.out.println(builder1);

    }
}
