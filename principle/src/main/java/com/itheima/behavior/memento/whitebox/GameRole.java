package com.itheima.behavior.memento.whitebox;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 18:23
 * @Description:
 */
public class GameRole {
    private int vit;

    private int atk;

    private int def;

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(this.vit,this.atk,this.def);
    }

    public void recoverState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    public void displayState(){
        System.out.println("角色信息展示");
        System.out.println("生命力："+this.vit);
        System.out.println("攻击力："+this.atk);
        System.out.println("防御力："+this.def);
    }

    public GameRole() {
    }

    public GameRole(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    /**
     * 获取
     * @return vit
     */
    public int getVit() {
        return vit;
    }

    /**
     * 设置
     * @param vit
     */
    public void setVit(int vit) {
        this.vit = vit;
    }

    /**
     * 获取
     * @return atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * 设置
     * @param atk
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * 获取
     * @return def
     */
    public int getDef() {
        return def;
    }

    /**
     * 设置
     * @param def
     */
    public void setDef(int def) {
        this.def = def;
    }

    public String toString() {
        return "GameRole{vit = " + vit + ", atk = " + atk + ", def = " + def + "}";
    }
}
