package com.itheima.structure.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 10:04
 * @Description:
 */
public class ProxyFactory {

    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取服务费");
                        return method.invoke(station,args);
                    }
                }
        );
    }
}
