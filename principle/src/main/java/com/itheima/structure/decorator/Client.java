package com.itheima.structure.decorator;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 19:27
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FriedRice();
//        System.out.println(friedRice.getDesc());
//        System.out.println(friedRice.cost());

        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+" "+ fastFood.cost());
        fastFood = new Egg(fastFood);
        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc()+" "+ fastFood.cost());

    }
}
