package com.itheima.framework.beans;

/**
 * @Auther: lyl
 * @Date: 2024/3/1 16:16
 * @Description:
 */
public class PropertyValue {

    private String name;

    private String ref;

    private String value;

    public PropertyValue() {
    }

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * 设置
     * @param ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * 获取
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return "PropertyValue{name = " + name + ", ref = " + ref + ", value = " + value + "}";
    }
}
