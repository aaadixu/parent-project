package com.atguigu.design.structure.decorator;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 16:52
 */
public class DarkRoast extends AbstractBeverage{
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 0;
    }
}
