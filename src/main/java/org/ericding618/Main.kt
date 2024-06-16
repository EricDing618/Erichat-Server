package org.ericding618

fun main(args: Array<String>){
    val version = 0.1
    val tool = Tools()

    if (args.isEmpty()){ //没有添加参数
        //欢迎语
        tool.PrintTimeSleep("欢迎使用Erichat Server（v$version）！")
        tool.PrintTimeSleep("当前时间为："+tool.GetTime()+" 。")
        tool.PrintTimeSleep("检测：本程序正在"+tool.GetOS()+"操作系统上运行。")
        tool.PrintTimeSleep("您可以输入“help”获取命令帮助，或者输入“quit”以退出程序。")
        tool.PrintTimeSleep("您还可以输入其他命令，例如“login”或“create”。")

        //循环等待输入命令
        var quit = false
        while (quit == false){
            print("You> ")
            val input = readLine() //用户输入

            if (input != null){ //输入不为空
                if (input == "quit"){
                    quit = true //退出程序
                }else{
                    val cmd = Cmd()
                    cmd.give(input) //把命令交给“./Cmds.kt”处理
                }
            }
        }
    }else{ //处理参数
        tool.PrintTimeSleep("该功能正在施工ing...")
    }
}