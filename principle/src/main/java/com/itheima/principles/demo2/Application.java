package com.itheima.principles.demo2;

import java.util.Random;

/**
 * @Auther: lyl
 * @Date: 2024/1/23 14:12
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(20);

        Square square = new Square();
        square.setLength(20);

        resize(rectangle);
        printLW(rectangle);

        printLW(square);

    }

    //扩宽
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void printLW(Quadrlateral quadrlateral){
        System.out.println("长" + quadrlateral.getLength());
        System.out.println("宽" + quadrlateral.getWidth());
    }

}
