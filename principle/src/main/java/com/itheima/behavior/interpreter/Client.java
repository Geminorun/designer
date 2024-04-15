package com.itheima.behavior.interpreter;

/**
 * @Auther: lyl
 * @Date: 2024/2/27 19:37
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        AbstractExpression expression = new Minus(a, new Plus(new Minus(b,c),d ));
        int interpret = expression.interpret(context);
        System.out.println(expression);
        System.out.println(interpret);
    }
}
