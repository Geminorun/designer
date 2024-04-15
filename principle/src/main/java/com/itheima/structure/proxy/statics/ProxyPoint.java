package com.itheima.structure.proxy.statics;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 09:57
 * @Description:
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取服务费用");
        trainStation.sell();
    }
}
