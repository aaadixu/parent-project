package com.atguigu.design.structure.bridge;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 12:29
 */
public class OfflineSale extends AbstractSale{
    public OfflineSale(Integer price,String type){
        this.price = price;
        this.type = type;
    }
}
