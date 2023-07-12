package com.atguigu.design.creation.factory.factorymethod;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 22:21
 */
public class LatteCoffeeFactory extends CoffeeFactory{
    @Override
    Coffee createCoffee() {
        return new LatteCoffee();
    }
}
