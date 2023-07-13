package com.atguigu.design.structure.bridge;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 12:28
 */
public class OnlineSale extends AbstractSale{

    public OnlineSale(Integer price,String type){
        this.price = price;
        this.type = type;
    }

}
