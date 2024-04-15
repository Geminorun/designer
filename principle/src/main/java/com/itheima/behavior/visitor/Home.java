package com.itheima.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 19:30
 * @Description:
 */
public class Home {
    private List<Animal> list = new ArrayList<>();

    public void add(Animal animal){
        list.add(animal);
    }

    public void action(Person person){
        list.forEach(x->x.accept(person));
    }

}
