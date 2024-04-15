package com.itheima.principles.demo3;

import com.itheima.principles.demo3.interfaces.CPU;
import com.itheima.principles.demo3.interfaces.HardDisk;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 09:29
 * @Description:
 */
public class Computer {
    private HardDisk hardDisk;
    private CPU cpu;

    public Computer() {
    }

    public Computer(HardDisk hardDisk, CPU cpu) {
        this.hardDisk = hardDisk;
        this.cpu = cpu;
    }

    public void run(){
        System.out.println("计算机开始运行");
        hardDisk.get();
        cpu.run();
    }


    /**
     * 获取
     * @return hardDisk
     */
    public HardDisk getHardDisk() {
        return hardDisk;
    }

    /**
     * 设置
     * @param hardDisk
     */
    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    /**
     * 获取
     * @return cpu
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * 设置
     * @param cpu
     */
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public String toString() {
        return "Computer{hardDisk = " + hardDisk + ", cpu = " + cpu + "}";
    }
}
