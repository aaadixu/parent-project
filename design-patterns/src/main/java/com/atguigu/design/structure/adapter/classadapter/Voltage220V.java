package com.atguigu.design.structure.adapter.classadapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 10:31
 */
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("电压：" + src + "V");
        return src;
    }
}
