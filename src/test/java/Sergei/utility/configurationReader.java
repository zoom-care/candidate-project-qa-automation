package Sergei.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {


// that code help us to read data from configuration.properties file, and use that data where we need in framework
    private static Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
       }
    }
    public static String getProperty (String keyword){

        return properties.getProperty(keyword);
    }

}
