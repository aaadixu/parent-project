package com.atguigu.design.structure.decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 16:52
 */
public class HouseBlend extends AbstractBeverage{
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0;
    }
}
