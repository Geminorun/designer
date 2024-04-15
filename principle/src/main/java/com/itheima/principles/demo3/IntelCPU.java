package com.itheima.principles.demo3;

import com.itheima.principles.demo3.interfaces.CPU;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 09:28
 * @Description:
 */
public class IntelCPU implements CPU {

    @Override
    public void run(){
        System.out.println("英特尔CPU正在运行");
    }
}
