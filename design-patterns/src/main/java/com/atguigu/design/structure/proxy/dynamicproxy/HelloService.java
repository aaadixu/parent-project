package com.atguigu.design.structure.proxy.dynamicproxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 19:04
 */
public class HelloService implements IHelloService{
    @Override
    public String sayHello(String userName) {
        System.out.println(userName + " hello");
        return userName + " hello";
    }

    @Override
    public String sayByeBye(String userName) {
        System.out.println(userName + " ByeBye");
        return userName + " ByeBye";
    }

}
