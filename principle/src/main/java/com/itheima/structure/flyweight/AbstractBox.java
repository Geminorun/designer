package com.itheima.structure.flyweight;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 18:10
 * @Description:
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状："+ getShape() + "   颜色："+ color);
    }

}
