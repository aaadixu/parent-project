package com.atguigu.design.structure.adapter.classadapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 10:29
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("===========类适配器模式===========");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
