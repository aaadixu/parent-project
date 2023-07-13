package com.atguigu.design.structure.bridge;


/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 12:31
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractSale sale = new OfflineSale(9999,"线下");
        AbstractPhone phone = new MiPhone(sale);

        System.out.println(phone.getPhone());

    }
}
