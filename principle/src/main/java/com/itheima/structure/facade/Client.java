package com.itheima.structure.facade;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 11:07
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        System.out.println("===================");
        facade.say("关闭家电");
    }
}
