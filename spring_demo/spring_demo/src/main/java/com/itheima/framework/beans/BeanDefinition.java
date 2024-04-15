package com.itheima.framework.beans;

/**
 * @Auther: lyl
 * @Date: 2024/3/4 09:48
 * @Description: 用来封装bean标签数据
 */
public class BeanDefinition {
    private String id;
    private String className;

    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public BeanDefinition(String id, String className, MutablePropertyValues propertyValues) {
        this.id = id;
        this.className = className;
        this.propertyValues = propertyValues;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return className
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取
     * @return propertyValues
     */
    public MutablePropertyValues getPropertyValues() {
        return propertyValues;
    }

    /**
     * 设置
     * @param propertyValues
     */
    public void setPropertyValues(MutablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String toString() {
        return "BeanDefinition{id = " + id + ", className = " + className + ", propertyValues = " + propertyValues + "}";
    }
}
