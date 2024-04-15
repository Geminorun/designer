package com.itheima.behavior.mediator;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 10:41
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        MegiatorStructure megiatorStructure = new MegiatorStructure();
        Tenant tenant = new Tenant("张三", megiatorStructure);
        HouseOwner houseOwner = new HouseOwner("房主", megiatorStructure);

        megiatorStructure.setTenant(tenant);
        megiatorStructure.setHouseOwner(houseOwner);

        tenant.constact("我要租房，要三室一厅的");
        houseOwner.constact("我这里有三室一厅的房子");
        

    }

}
