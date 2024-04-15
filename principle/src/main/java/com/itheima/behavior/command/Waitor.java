package com.itheima.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lyl
 * @Date: 2024/2/1 10:15
 * @Description:
 */
public class Waitor {
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command){
        commands.add(command);
    }

    public void OrderUp(){
        System.out.println("服务员：大厨新订单来了");
        for (Command command : commands) {
            if (command!=null){
                command.execute();
            }
        }
    }
}
