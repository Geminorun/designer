package com.itheima.structure.adapte;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 19:33
 * @Description:
 */
public class Computer {

    public String readSD(SDCard sdCard){
        if (sdCard==null){
            throw new NullPointerException("SD卡不能为null");
        }
        return sdCard.readSD();
    }


}
