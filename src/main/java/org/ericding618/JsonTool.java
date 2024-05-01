package org.ericding618;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Map;


public class JsonTool {

    /**
     * 将JSON文件和Map互转
     * @param filePath JSON文件路径
     * @return 解析后的Map
     * @throws IOException 文件读取异常
     * @throws JsonSyntaxException JSON语法异常*/

    public Map<String, Object> parseJSONToMap(String filePath) throws IOException, JsonSyntaxException {
        Gson json = new Gson();
        // 使用FileReader读取JSON文件
        try (FileReader reader = new FileReader(filePath)) {
            // 使用Gson从JSON文件中解析Map
            return json.fromJson(reader, new TypeToken<Map<String, Object>>(){}.getType());
        }
    }

    public void writeMapToJson(String filePath, Map<String, Object> map) throws IOException {
        // 创建GsonBuilder并设置漂亮打印
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        // 创建Gson对象
        Gson gson = gsonBuilder.create();

        // 将Map转换为JSON字符串
        String json = gson.toJson(map);

        // 使用FileWriter写入JSON文件
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(json);
            writer.flush();
        }
    }
}

