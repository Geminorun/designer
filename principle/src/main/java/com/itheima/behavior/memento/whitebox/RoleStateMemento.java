package com.itheima.behavior.memento.whitebox;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 18:26
 * @Description:
 */
public class RoleStateMemento {

    private int vit;

    private int atk;

    private int def;


    public RoleStateMemento() {
    }

    public RoleStateMemento(int vit, int atk, int def) {
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
        return "RoleStateMemento{vit = " + vit + ", atk = " + atk + ", def = " + def + "}";
    }
}
