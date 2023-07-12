package com.atguigu.design.creation.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 20:56
 */
public class SingletonLazy1 {
    //在成员位置创建该类的对象
    private static SingletonLazy1 instance;

    //私有构造方法
    private SingletonLazy1() {
    }

    //对外提供静态方法获取该对象
    public static synchronized SingletonLazy1 getInstance() {

        if (instance == null) {
            instance = new SingletonLazy1();
        }
        return instance;
    }
}
