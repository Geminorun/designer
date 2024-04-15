package com.itheima.behavior.state;

/**
 * @Auther: lyl
 * @Date: 2024/2/18 14:33
 * @Description:
 */
public abstract class LiftState {
    protected Context context;

    void setContext(Context context){
        this.context = context;
    }

    abstract void open();
    abstract void close();
    abstract void run();
    abstract void stop();


}
