package com.atguigu.design.structure.decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 17:01
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractBeverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Mocha(espresso);

        System.out.println(espresso.getDescription() + " $" + espresso.cost());


    }
}
