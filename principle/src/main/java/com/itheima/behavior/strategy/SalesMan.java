package com.itheima.behavior.strategy;

/**
 * @Auther: lyl
 * @Date: 2024/1/31 19:04
 * @Description:
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void saleManShow(){
        strategy.show();
    }
}
