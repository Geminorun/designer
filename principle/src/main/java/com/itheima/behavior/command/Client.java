package com.itheima.behavior.command;

/**
 * @Auther: lyl
 * @Date: 2024/2/1 10:41
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFoodDir("鸡蛋炒饭",1);
        order1.setFoodDir("可乐", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDir("鸡腿饭",1);
        order2.setFoodDir("雪碧", 2);

        SeniorChef receiver = new SeniorChef();

        OrderCommand command1 = new OrderCommand(receiver, order1);
        OrderCommand command2 = new OrderCommand(receiver, order2);

        Waitor invoke = new Waitor();
        invoke.setCommand(command1);
        invoke.setCommand(command2);

        invoke.OrderUp();


    }
}
