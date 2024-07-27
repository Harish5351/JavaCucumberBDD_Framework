package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        ReadProperties rp = new ReadProperties();
        String value = rp.ReadFile("Resources/Locators.properties","Username");
        System.out.println("Value of prop keyword: " +value);
    }

    public String ReadFile(String filePath, String keyword) throws IOException {
        FileReader fr = new FileReader(filePath);
        Properties prop = new Properties();
        prop.load(fr);
        String key = prop.getProperty(keyword);
        return key;
    }
}
