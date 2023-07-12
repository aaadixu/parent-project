package com.atguigu.design.creation.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 21:00
 */
public class SingletonLazy3 {


    private SingletonLazy3(){

    }

    private static class SingletonHolder {
        private static final SingletonLazy3 INSTANCE = new SingletonLazy3();
    }

    public static SingletonLazy3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
