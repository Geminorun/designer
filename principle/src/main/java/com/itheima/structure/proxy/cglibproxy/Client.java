package com.itheima.structure.proxy.cglibproxy;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 11:14
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
