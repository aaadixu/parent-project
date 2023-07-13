package com.atguigu.design.structure.adapter.classadapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 10:33
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44; // 转换电压
        return dstV;
    }
}
