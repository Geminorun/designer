package com.itheima.principles.demo1;

/**
 * @Auther: lyl
 * @Date: 2024/1/23 13:46
 * @Description:
 */
public class SougouInput {

    private AbstractSkin skin;

    SougouInput(AbstractSkin skin){
        this.skin=skin;
    }

    public void Display(){
        skin.Display();
    }

}
