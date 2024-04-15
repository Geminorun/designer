package com.itheima.behavior.observer;

/**
 * @Auther: lyl
 * @Date: 2024/2/19 09:33
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();


        subscriptionSubject.atach( new WeiXinUser("张三"));
        subscriptionSubject.atach( new WeiXinUser("李四"));
        subscriptionSubject.atach( new WeiXinUser("王五"));

        subscriptionSubject.notify("你关注的律师公众号更新了");
    }
}
