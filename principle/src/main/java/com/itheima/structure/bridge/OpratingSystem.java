package com.itheima.structure.bridge;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 20:40
 * @Description:
 */
public abstract class OpratingSystem {
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String filename);
}
