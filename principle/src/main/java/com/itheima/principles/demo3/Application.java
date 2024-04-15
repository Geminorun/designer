package com.itheima.principles.demo3;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 09:31
 * @Description:
 */
public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new IntelCPU());
        computer.setHardDisk(new XieJieHardDisk());
        computer.run();
    }
}
