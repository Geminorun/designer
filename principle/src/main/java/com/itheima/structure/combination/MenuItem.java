package com.itheima.structure.combination;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 17:22
 * @Description:
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
