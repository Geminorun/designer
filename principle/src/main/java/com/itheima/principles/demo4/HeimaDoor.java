package com.itheima.principles.demo4;

import com.itheima.principles.demo4.interfaces.Antitheft;
import com.itheima.principles.demo4.interfaces.FireProof;
import com.itheima.principles.demo4.interfaces.WaterProof;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 09:48
 * @Description:
 */
public class HeimaDoor implements Antitheft, FireProof, WaterProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
