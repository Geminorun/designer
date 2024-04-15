package com.itheima.structure.bridge;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 20:39
 * @Description:
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String filename) {
        System.out.println("avi视频文件："+filename);
    }
}
