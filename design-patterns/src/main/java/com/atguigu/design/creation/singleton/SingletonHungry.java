package com.atguigu.design.creation.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 20:50
 */
public class SingletonHungry {
    //在本类中创建对象
    private static SingletonHungry instance = new SingletonHungry();
    // 私有化构造方法
    private SingletonHungry(){

    }

    //提供公共的访问方法获取实例
    public static SingletonHungry getInstance(){
        return instance;
    }
}
