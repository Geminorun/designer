package com.itheima.behavior.strategy;

/**
 * @Auther: lyl
 * @Date: 2024/1/31 19:02
 * @Description:
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
