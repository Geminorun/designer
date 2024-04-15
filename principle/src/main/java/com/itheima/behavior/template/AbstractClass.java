package com.itheima.behavior.template;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 18:51
 * @Description:
 */
public abstract class AbstractClass {

    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    private void pourOil(){
        System.out.println("倒油");
    }

    private void heatOil(){
        System.out.println("热油");
    }
    protected abstract void pourVegetable();

    protected abstract void pourSauce();

    private void fry() {
        System.out.println("翻炒");
    }

}
