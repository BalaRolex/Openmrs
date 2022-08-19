package dataproviders;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Enum.DriverType;
import Enum.EnvionmentType;

public class configReader  {
	public Properties prop;
	File f=new File("src\\main\\java\\Configuration\\config.properties");
	public configReader() throws IOException
	{
		try
		{
		FileInputStream read=new FileInputStream(f);
		prop=new Properties();
		prop.load(read);
		}
		catch(Exception e)
		{
			throw new RuntimeException("Configuration.properties not found at " +f);
		}
	}
	public String getchromeDriverPath()
	{
		String cdriverpath=prop.getProperty("cdriverpath");
		if(cdriverpath!=null)
		return cdriverpath;
		else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:"+"cdriverPath");
	}
	public String getedgeDriverPath()
	{
		String mdriverpath=prop.getProperty("mdriverpath");
		if(mdriverpath!=null)
		return mdriverpath;
		else throw new RuntimeException("Driver Path not specified in the Configuration.properties file for the Key:driverPath");
	}
	public String ApplicationUrl()
	{
		String url=prop.getProperty("url");
		if(url!=null)
		return url;
		else throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
	}
	public DriverType getBrowser() {
		String browserName = prop.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("edge")) return DriverType.MICROSOFTEDGE;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	public EnvionmentType getEnvironment() {
		String environmentName = prop.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvionmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvionmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
	public Boolean getBrowserWindowSize() {
		String winodowsize=prop.getProperty("windowMaximize");
		if(winodowsize != null) return Boolean.valueOf(winodowsize);
		return true;
	}
	

}
