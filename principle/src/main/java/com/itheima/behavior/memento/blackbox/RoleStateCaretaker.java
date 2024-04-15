package com.itheima.behavior.memento.blackbox;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 18:30
 * @Description:
 */
public class RoleStateCaretaker {

    private Memento memento;


    public RoleStateCaretaker() {
    }

    public RoleStateCaretaker(Memento memento) {
        this.memento = memento;
    }

    /**
     * 获取
     * @return memento
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * 设置
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public String toString() {
        return "RoleStateCaretaker{memento = " + memento + "}";
    }
}
