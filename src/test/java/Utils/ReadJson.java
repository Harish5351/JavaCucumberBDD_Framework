package Utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJson {
    public static Config readConfigFromFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        Config config = null;
        try {
            config = objectMapper.readValue(new File(filePath), Config.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return config;
    }

    public static void main(String[] args) {
        String filePath = "Resources/TestData.json";
        Config config = ReadJson.readConfigFromFile(filePath);
        if (config != null) {
            System.out.println(config);
        }
    }
}
