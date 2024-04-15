package com.itheima.behavior.memento.whitebox;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 18:31
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("大战Boss前");

        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.displayState();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("大战Boss后");

        gameRole.fight();
        gameRole.displayState();

        gameRole.recoverState(caretaker.getRoleStateMemento());
        gameRole.displayState();
    }
}
