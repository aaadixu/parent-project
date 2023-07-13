package com.atguigu.design.structure.decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 16:54
 */
public class Milk extends CondimentDecorator{
    AbstractBeverage beverage;

    public Milk(AbstractBeverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
