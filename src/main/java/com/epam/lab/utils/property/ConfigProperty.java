package com.epam.lab.utils.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {
    private Properties prop = new Properties();

    public ConfigProperty() {
        FileInputStream input = null;
        try {
            input = new FileInputStream("src/main/resources/config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getChromeDriver() {
        return prop.getProperty("webDriverChrome");
    }

    public String getUrl() {
        return prop.getProperty("pathDriver");
    }

    public String getLink() {
        return prop.getProperty("easyTripWebSite");
    }

    public String getChromeExtension(){return prop.getProperty("chromeExtension");}

    public String getAdminLogin(){return prop.getProperty("adminLogin");}

    public String getAdminPassword(){return prop.getProperty("adminPassword");}
}
