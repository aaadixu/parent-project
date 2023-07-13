package com.atguigu.design.structure.adapter.objectadapter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 10:59
 */
public class Voltage220V {
    // 输出220V电压
    public int output220V(){
        int src = 220;
        System.out.println("电压：" + src + "V");
        return src;
    }
}
