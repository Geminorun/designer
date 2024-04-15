package com.itheima.behavior.interpreter;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 19:30
 * @Description:
 */
public class Plus extends AbstractExpression{

    private AbstractExpression left;
    private AbstractExpression right;

    public Plus() {
    }

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)+right.interpret(context);
    }

    /**
     * 获取
     * @return left
     */
    public AbstractExpression getLeft() {
        return left;
    }

    /**
     * 设置
     * @param left
     */
    public void setLeft(AbstractExpression left) {
        this.left = left;
    }

    /**
     * 获取
     * @return right
     */
    public AbstractExpression getRight() {
        return right;
    }

    /**
     * 设置
     * @param right
     */
    public void setRight(AbstractExpression right) {
        this.right = right;
    }

    public String toString() {
        return "Plus{left = " + left + ", right = " + right + "}";
    }
}
