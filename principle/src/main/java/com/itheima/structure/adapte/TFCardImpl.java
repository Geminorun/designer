package com.itheima.structure.adapte;

import com.itheima.principles.demo1.SougouInput;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 18:47
 * @Description:
 */
public class TFCardImpl implements TFCard{

    private String msg = "这是TF卡数据";

    @Override
    public String readTF() {
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println(msg);
        this.msg = msg;
    }
}
