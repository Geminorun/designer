package com.itheima.framework.beans;

import com.sun.source.tree.IfTree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: lyl
 * @Date: 2024/3/1 16:20
 * @Description: 用来存储和管理多个PropertyValue对象
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{

   private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues(){
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList){

        if (propertyValueList==null){
            this.propertyValueList = new ArrayList<>();
        }else {
            this.propertyValueList = propertyValueList;
        }
    }

    public PropertyValue[] getPropertyValues(){
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String name){
        return propertyValueList.stream().findFirst().orElse(null);
    }

    public boolean isEmpty(){
        return this.propertyValueList.isEmpty();
    }

    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue){
        Optional<PropertyValue> first = this.propertyValueList.stream()
                .filter(item -> Objects.equals(item.getName(), propertyValue.getName())).findFirst();
        if (first.isPresent()){
            first.stream().forEach(item->{
                item.setValue(propertyValue.getValue());
            });
        }else{
            this.propertyValueList.add(propertyValue);
        }
        return this;
    }

    public boolean contains(String propertyName){
        return getPropertyValue(propertyName)!=null;
    }


    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }



}
