package com.itheima.creator.factory.simple;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 20:10
 * @Description:
 */
public class CoffeeFactory {

    private static HashMap<String,Coffee> map=new HashMap<>();

    static {
        Properties p = new Properties();
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");;
        try {
            p.load(resourceAsStream);
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                map.put((String) key,coffee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
