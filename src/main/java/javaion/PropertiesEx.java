package javaion;

import java.io.*;
import java.util.Properties;

public class PropertiesEx {
    Properties properties = new Properties();
    private static final String FILE_PATH = "dbConfig.propertyFile";
    public void createDBConfiguration() throws IOException {
        OutputStream outputStream = new FileOutputStream(FILE_PATH);
//        Properties properties = new Properties();
        properties.setProperty("url","localhost");
        properties.setProperty("port","3306");
        properties.setProperty("username","root");
        properties.setProperty("password","root");
        properties.store(outputStream,"");

    }

    public void readDBConfigProperties() throws IOException {
        InputStream inputStream = new FileInputStream(FILE_PATH);
        properties.load(inputStream);
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("port"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));


    }

    public static void main(String[] args) throws IOException {
//        Create DB Properties only creates once.
//        new PropertiesEx().createDBConfiguration();
        new PropertiesEx().readDBConfigProperties();
    }

}
