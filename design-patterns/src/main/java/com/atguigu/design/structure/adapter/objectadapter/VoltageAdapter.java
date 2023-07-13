package com.atguigu.design.structure.adapter.objectadapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 11:01
 */
public class VoltageAdapter implements IVoltage5V{
    private Voltage220V voltage220V; // 关联关系-聚合

    public VoltageAdapter(Voltage220V v){
        this.voltage220V = v;
    }

    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        System.out.println("使用适配器进行适配");
        int dstV = srcV / 44; // 转换电压
        return dstV;
    }
}
