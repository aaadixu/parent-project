package com.atguigu.design.creation.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 20:53
 */
public class SingletonHungry1 {
    //在本类中创建对象
    private static SingletonHungry1 instance;
    // 私有化构造方法
    private SingletonHungry1(){
    }

    static {
        instance = new SingletonHungry1();
    }

    //提供公共的访问方法获取实例
    public static SingletonHungry1 getInstance(){
        return instance;
    }
}
