package com.atguigu.design.structure.adapter.classadapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 10:28
 */
public class Phone {

    // 充电
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V,不能充电");
        }

    }
}
