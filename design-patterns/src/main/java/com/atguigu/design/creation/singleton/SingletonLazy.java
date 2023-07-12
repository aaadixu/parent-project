package com.atguigu.design.creation.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 20:55
 */
public class SingletonLazy {
    //在成员位置创建该类的对象
    private static SingletonLazy instance;
    //私有构造方法
    private SingletonLazy() {
    }

    //对外提供静态方法获取该对象
    public static SingletonLazy getInstance() {

        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
