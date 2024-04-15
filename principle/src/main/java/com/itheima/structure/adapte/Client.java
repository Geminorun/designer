package com.itheima.structure.adapte;

/**
 * @Auther: lyl
 * @Date: 2024/1/26 19:37
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(msg);
    }
}
