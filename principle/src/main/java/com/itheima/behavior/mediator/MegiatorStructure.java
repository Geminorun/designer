package com.itheima.behavior.mediator;

import java.lang.annotation.Target;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 10:38
 * @Description:
 */
public class MegiatorStructure extends Mediator{

    private Tenant tenant;

    private HouseOwner houseOwner;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void constact(String msg, Person person) {
        if (person==houseOwner){
            tenant.getMessage(msg);
        }else {
            houseOwner.getMessage(msg);
        }
    }
}
