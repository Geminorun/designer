package com.itheima.structure.flyweight;

import java.util.HashMap;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 18:13
 * @Description:
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    private static BoxFactory factory = new BoxFactory();

    public static BoxFactory getInstance(){
        return factory;
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }


}
