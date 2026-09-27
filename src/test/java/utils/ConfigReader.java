package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static Properties properties;
	
	static 
	{
		try
		{
			String path = System.getProperty("user.dir") + "/src/test/resources/config.properties";
			FileInputStream fileinputstream = new FileInputStream(path);
			
			 properties = new Properties();
			properties.load(fileinputstream);
			fileinputstream.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
            throw new RuntimeException("Could not load config.properties file at the specified path.");
		}
	}
	
	// Generic method to fetch any property by key
    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value != null) {
            return value.trim();
        } else {
            throw new RuntimeException("Property '" + key + "' not found in config.properties file.");
        }
    }

}
