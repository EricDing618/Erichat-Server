package org.ericding618

fun main(args: Array<String>){
    val version = 0.1
    val tool = Tools()
    if (args.isEmpty()){
        tool.PrintTimeSleep("欢迎使用Erichat Server（v$version）！")
        tool.PrintTimeSleep("当前时间为："+tool.GetTime()+" 。")
        tool.PrintTimeSleep("检测：本程序正在"+tool.GetOS()+"操作系统上运行。")
        tool.PrintTimeSleep("您可以输入“help”获取命令帮助，或者输入“quit”以退出程序。")
        tool.PrintTimeSleep("您还可以输入其他命令，例如“login”或“create”。")
        var quit = false
        while (quit == false){
            print("You> ")
            val input = readLine()
            if (input != null){
                if (input == "quit"){
                    quit = true
                }else{
                    val cmd = Cmd()
                    cmd.give("")
                }
            }
        }
    }else{
        tool.PrintTimeSleep("该功能正在施工ing...")
    }
}