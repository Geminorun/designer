package com.itheima.behavior.strategy;

/**
 * @Auther: lyl
 * @Date: 2024/1/31 19:06
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.saleManShow();
    }
}
