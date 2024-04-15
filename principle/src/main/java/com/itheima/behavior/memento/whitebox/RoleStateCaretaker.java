package com.itheima.behavior.memento.whitebox;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 18:30
 * @Description:
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;


    public RoleStateCaretaker() {
    }

    public RoleStateCaretaker(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }

    /**
     * 获取
     * @return roleStateMemento
     */
    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    /**
     * 设置
     * @param roleStateMemento
     */
    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }

    public String toString() {
        return "RoleStateCaretaker{roleStateMemento = " + roleStateMemento + "}";
    }
}
