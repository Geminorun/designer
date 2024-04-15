package com.itheima.structure.bridge;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 20:44
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        OpratingSystem system = new Windows(new AviFile());
        system.play("战狼3");
    }
}
