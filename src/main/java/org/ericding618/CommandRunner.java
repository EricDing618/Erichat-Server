package org.ericding618;

import java.util.*;
import org.ericding618.JsonTool;
import org.ericding618.tools;

public class CommandRunner {
    JsonTool CommandJson = new JsonTool();
    tools tool = new tools();

    public Boolean CommandNameIsTrue(String cmd) {
        try {
            Map Command = CommandJson.parseJSONToMap(tool.GetResourcePath("CommandConfig.json"));
        }catch (Exception e){
            System.out.println("错误：配置损坏。");
            e.printStackTrace();
        }
    }
}
