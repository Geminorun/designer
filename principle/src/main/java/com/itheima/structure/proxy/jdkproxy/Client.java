package com.itheima.structure.proxy.jdkproxy;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 10:17
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets sellTickets = factory.getProxyObject();
        sellTickets.sell();
    }
}
