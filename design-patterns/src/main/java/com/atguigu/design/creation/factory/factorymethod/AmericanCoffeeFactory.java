package com.atguigu.design.creation.factory.factorymethod;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 22:22
 */
public class AmericanCoffeeFactory extends CoffeeFactory{
    @Override
    Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
