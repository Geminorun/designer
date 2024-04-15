package com.itheima.behavior.observer;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 09:30
 * @Description:
 */
public interface Subject {

    // 添加订阅者
    void atach(Observer observer);

    void detach(Observer observer);

    void notify(String message);

}
