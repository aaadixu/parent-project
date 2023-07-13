package com.atguigu.design.structure.bridge;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 12:30
 */
public class MiPhone extends AbstractPhone{

    public MiPhone(AbstractSale sale){
        this.sale = sale;
    }

    @Override
    public String getPhone() {
        return "MiPhone: off/on：" + sale.type + ",价格为："+sale.price;
    }
}
