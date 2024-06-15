package org.ericding618;

import java.io.IOException;
import java.util.*;
import java.lang.String;

public class old {
    double VERSION = 0.1; //服务端的版本
    Tools tool = new Tools();

    public void App() throws IOException {
        tool.PrintTimeSleep(tool.GetResourcePath(""));
        tool.PrintTimeSleep("欢迎使用Erichat Server（v"+VERSION+"）！");
        tool.PrintTimeSleep("当前时间为："+tool.GetTime()+" 。");
        tool.PrintTimeSleep("检测：本程序正在"+tool.GetOS()+"操作系统上运行。");
        tool.PrintTimeSleep("您可以输入“help”获取命令帮助，或者输入“quit”以退出程序。");
        tool.PrintTimeSleep("您还可以输入其他命令，例如“login”或“create”。");
        JsonTool readset = new JsonTool();

        int quit = 0;
        while (quit == 0){
            Scanner scan = new Scanner(System.in);
            System.out.print("> ");

            if (scan.hasNextLine()){
                String cmd = scan.nextLine();
                List<String> cmds = Arrays.asList(cmd.split(" "));

                if (cmd.equals("quit")){ //优先判断退出程序命令
                    scan.close();
                    System.out.println("Quit successfully.");
                    quit = 1;

                }else if (cmds.getFirst().equals("help")){
                    System.out.println("ok");

                }else if (cmds.getFirst().equals("login")){

                }else{
                    System.out.println("异常：没有命名为“"+cmds.getFirst()+"”的命令，请输入“help”获取命令帮助。");
                }
            }
        }
    }

    public static void main(String[] args) { // 运行
        old run = new old();
        try {
            run.App();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}