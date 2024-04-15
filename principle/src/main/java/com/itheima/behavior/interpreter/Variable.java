package com.itheima.behavior.interpreter;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 19:29
 * @Description:
 */
public class Variable extends AbstractExpression{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public Variable() {
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Variable{name = " + name + "}";
    }
}
