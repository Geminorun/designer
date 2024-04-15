package com.itheima.structure.adapte;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 19:31
 * @Description:
 */
public class SDCardImpl implements SDCard{

    @Override
    public String readSD() {
        return "SD卡数据";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD卡写数据："+msg);
    }
}
