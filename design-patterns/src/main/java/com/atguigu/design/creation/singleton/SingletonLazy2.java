package com.atguigu.design.creation.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/12 20:57
 */
public class SingletonLazy2 {

    private static volatile SingletonLazy2 instance; // 禁止指令重排

    private SingletonLazy2(){

    }

    public static SingletonLazy2 getInstance(){
        if(instance == null){
            synchronized (SingletonLazy2.class){
                if(instance == null){
                    instance = new SingletonLazy2();
                }
            }
        }
        return instance;
    }



}
