package com.itheima.framework.utils;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 14:10
 * @Description:
 */
public class StringUtils {
    private StringUtils(){

    }

    public static String getSetterMethodByFieldName(String fieldName){
        String methodName = "set" + fieldName.substring(0,1).toUpperCase()
                + fieldName.substring(1);
        return methodName;
    }
}
