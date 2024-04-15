package com.itheima.behavior.state;

/**
 * @Auther: lyl
 * @Date: 2024/2/18 14:34
 * @Description:
 */
public class StoppingState extends  LiftState{

    @Override
    void open() {
        System.out.println("电梯开启...");
    }

    @Override
    void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    void run() {

    }

    @Override
    void stop() {

    }
}
