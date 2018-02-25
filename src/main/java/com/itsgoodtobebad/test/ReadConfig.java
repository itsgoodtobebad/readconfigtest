package com.itsgoodtobebad.test;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;

/**
 * @author liliangxi.
 *         Created on 2018/2/25.
 */
public class ReadConfig {

    public static void main(String[] args) {
        String key = "projectname";
        String value;

        System.out.println("----------------------------------");
        Configurations configs = new Configurations();
        try{
            Configuration config = configs.properties(new File("config.properties"));
            value = config.getString(key);
            System.out.println(key + "=" + value);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

}
