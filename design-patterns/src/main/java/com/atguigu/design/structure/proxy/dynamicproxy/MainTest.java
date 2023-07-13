package com.atguigu.design.structure.proxy.dynamicproxy;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2023/7/13 19:02
 */
public class MainTest {
    public static void main(String[] args) {
        JavaProxyInvocationHandler proxyInvocationHandler = new JavaProxyInvocationHandler(new HelloService());
        IHelloService helloService = (IHelloService) proxyInvocationHandler.newProxyInstance();
        helloService.sayByeBye("paopao");
        helloService.sayHello("yupao");
    }
}
