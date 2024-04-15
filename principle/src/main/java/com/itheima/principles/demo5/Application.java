package com.itheima.principles.demo5;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 10:15
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("林青霞"));
        agent.setFans(new Fans("张三"));
        agent.setCompany(new Company("道和影视"));

        agent.metting();
        agent.bussiness();
    }
}
