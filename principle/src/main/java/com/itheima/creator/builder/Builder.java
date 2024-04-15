package com.itheima.creator.builder;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 19:38
 * @Description:
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

    public Bike consturct(){
        buildSeat();
        buildFrame();
        return createBike();
    }
}
