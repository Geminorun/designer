package com.itheima.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 09:33
 * @Description:
 */
public class SubscriptionSubject implements Subject{

    List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void atach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        weiXinUserList.forEach(observer -> {
            observer.update(message);
        });
    }
}
