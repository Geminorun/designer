package com.itheima.creator.builder;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 19:42
 * @Description:
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
