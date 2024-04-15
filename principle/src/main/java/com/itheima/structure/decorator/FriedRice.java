package com.itheima.structure.decorator;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 19:24
 * @Description:
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }

    public String toString() {
        return "FriendRice{}";
    }
}
