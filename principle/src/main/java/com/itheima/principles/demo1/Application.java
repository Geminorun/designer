package com.itheima.principles.demo1;

/**
 * @Auther: lyl
 * @Date: 2024/1/23 13:47
 * @Description:
 */
public class Application {
    public static void main(String[] args) {

        DefaultSkin skin = new DefaultSkin();
        HeimaSkin heimaSkin = new HeimaSkin();

        SougouInput sougouInput = new SougouInput(heimaSkin);

        sougouInput.Display();
    }
}
