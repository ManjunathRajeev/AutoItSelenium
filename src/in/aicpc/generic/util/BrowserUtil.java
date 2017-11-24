package in.aicpc.generic.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	public static WebDriver driver;
	public static void openBrowser()
	{
		if(ContantUtil.browser.equals(ContantUtil.FirefoxBrowser))
		{
			System.setProperty(ContantUtil.browserDriver,ContantUtil.browserDriverPath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
			
		}
		public static void closeBrowser()
		{
			driver.close();
		}
}
