package com.itheima.behavior.command;

import java.util.Map;
import java.util.Set;

/**
 * @Auther: lyl
 * @Date: 2024/2/1 10:14
 * @Description:
 */
public class OrderCommand implements  Command{

    private SeniorChef receiver;

    private Order order;


    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单：");
        Map<String,Integer> foodDir = order.getFoodDir();
        Set<String> keys = foodDir.keySet();
        for (String key : keys) {
            receiver.makeFood(foodDir.get(key), key);
        }
        System.out.println(order.getDiningTable()+"桌准备完毕");
    }

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }
}
