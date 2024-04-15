package com.itheima.structure.proxy.jdkproxy;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 09:56
 * @Description:
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
