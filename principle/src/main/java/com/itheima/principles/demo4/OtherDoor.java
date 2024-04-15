package com.itheima.principles.demo4;

import com.itheima.principles.demo4.interfaces.Antitheft;
import com.itheima.principles.demo4.interfaces.FireProof;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 09:49
 * @Description:
 */
public class OtherDoor implements Antitheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
