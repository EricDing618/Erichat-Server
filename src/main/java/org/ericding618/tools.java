package org.ericding618;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class tools {
    public String GetResourcePath(String FileName) {
        String resources_dir = Paths.get("./src/main/java").toAbsolutePath().normalize() +"\\resources\\";
        return resources_dir+FileName;
    }

    public String GetTime(){ //获取当前时间，并以“年:月:日 时:分:秒”的格式输出
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    public String GetOS(){
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("windows")) {
            return "Windows";
        } else if (os.contains("mac")) {
            return "macOS";
        } else if (os.contains("linux")) {
            return "Linux";
        } else {
            return "Unknown";
        }
    }

    public void PrintTimeSleep(String text){
        // 设置打字速度（毫秒）
        int speed = 50;

        // 逐字打印文本
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\n");
    }

}
