package com.atguigu.design.structure.adapter.objectadapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 10:51
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("===========对象适配器模式===========");
        VoltageAdapter voltageAdapter =new VoltageAdapter(new Voltage220V());
        Phone phone = new Phone();
        phone.charging(voltageAdapter);
    }
}
