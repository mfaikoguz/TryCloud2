package com.TryCloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- we created properties object
    private static Properties properties = new Properties();


    static {
        //2- get the path and store in String, or directly pass into fileInputStream obj
        String path = "configuration.properties";

        try {
            //3- we need to open the file
            FileInputStream file = new FileInputStream(path);

            //4- we need to load the file to properties object
            properties.load(file);

            //5- close.file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
    }

    //Our own custom method to read and get values from configuration.properties file
    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }
}