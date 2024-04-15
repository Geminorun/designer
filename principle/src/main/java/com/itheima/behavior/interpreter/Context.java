package com.itheima.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 19:29
 * @Description:
 */
public class Context {
    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable variable, Integer value){
        map.put(variable, value);
    }

    public int getValue(Variable variable){
        return map.get(variable);
    }
}
