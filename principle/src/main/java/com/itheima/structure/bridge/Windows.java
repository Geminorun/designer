package com.itheima.structure.bridge;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 20:42
 * @Description:
 */
public class Windows extends OpratingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videoFile.decode(filename);
    }
}
