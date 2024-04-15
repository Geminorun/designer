package com.itheima.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: lyl
 * @Date: 2024/2/1 10:17
 * @Description:
 */
public class Order {

    private int diningTable;

    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(String name ,int num) {
        foodDir.put(name,num);
    }
}
