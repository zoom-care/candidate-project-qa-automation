package com.zoomCare.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

   private static Properties properties = new Properties();

    static{
        try{

            FileInputStream file = new FileInputStream("config.properties");

            //Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            file.close();

        }catch(IOException e){
            e.printStackTrace();

        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
