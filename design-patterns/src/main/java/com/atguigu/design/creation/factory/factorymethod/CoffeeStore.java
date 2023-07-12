package com.atguigu.design.creation.factory.factorymethod;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 22:23
 */
public class CoffeeStore {
    private CoffeeFactory factory;
    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee(String type) {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }

}
