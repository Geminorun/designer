package com.itheima.structure.combination;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 17:13
 * @Description:
 */
public abstract class MenuComponent {
    protected String name;

    protected int level;

    // 添加子菜单
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return this.name;
    }

    public abstract void print();

}
