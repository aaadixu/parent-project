package com.atguigu.design.structure.decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 16:52
 */
public class Espresso extends AbstractBeverage{
    public Espresso(){
        description = "Espresso Coffee";
    }
    @Override
    public double cost() {
        return 0;
    }
}
