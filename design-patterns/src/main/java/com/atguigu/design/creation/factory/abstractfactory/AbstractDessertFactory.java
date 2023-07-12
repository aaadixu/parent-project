package com.atguigu.design.creation.factory.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 22:36
 */
public abstract class AbstractDessertFactory {
    abstract  Coffee createCoffee();

    abstract  Dessert createDessert();
}
