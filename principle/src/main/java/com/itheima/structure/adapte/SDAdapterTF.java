package com.itheima.structure.adapte;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 19:41
 * @Description:
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard =tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("适配器 读取TF卡");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("适配器 写入TF卡");
        tfCard.writeTF(msg);
    }
}
