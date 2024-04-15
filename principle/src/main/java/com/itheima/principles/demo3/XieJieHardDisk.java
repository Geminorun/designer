package com.itheima.principles.demo3;

import com.itheima.principles.demo3.interfaces.HardDisk;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 09:24
 * @Description:
 */
public class XieJieHardDisk implements HardDisk {
    @Override
    public void save(String data){
        System.out.println("希捷硬盘存储数据"+data);
    }

    @Override
    public String get(){
        System.out.println("希捷硬盘获取到数据");
        return "数据";
    }
}
