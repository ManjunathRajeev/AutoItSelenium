package in.aicpc.testcase;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import in.aicpc.generic.util.BrowserUtil;
import in.aicpc.generic.util.ContantUtil;

public class ForStudent_Wallet {
	
	public static void navigateToAicpc()
	{
		BrowserUtil.driver.get(ContantUtil.url);
	}
	
	public static void forStudent()
	{
		BrowserUtil.driver.findElement(By.linkText("For Students")).click();
	}
	
	public static void clickOnApply()
	{
		RemoteWebDriver script =  (RemoteWebDriver)BrowserUtil.driver;
		script.executeScript("window.scroll(0,2000)");
		BrowserUtil.driver.findElement(By.xpath("//a[text()='APPLY NOW']")).click();
	}
	
	public static void clickOnStratNow()
	{
		RemoteWebDriver script =  (RemoteWebDriver)BrowserUtil.driver;
		script.executeScript("window.scroll(0,2000)");
		BrowserUtil.driver.findElement(By.xpath("//a[.='START NOW']")).click();
	}
	
	public static void clickOnBackBtn() throws InterruptedException
	{
		
		Set<String> set = BrowserUtil.driver.getWindowHandles();
		Iterator<String> it  = set.iterator();
		String PWID = it.next();
		String CWID = it.next();
		BrowserUtil.driver.switchTo().window(CWID);
		Thread.sleep(2000);

		BrowserUtil.driver.findElement(By.xpath("//a[@class='btn btn-light-grey go-back']")).click();
		

		//BrowserUtil.driver.findElement(By.xpath("//form[@id='signup_user']/fieldset/div[7]/a")).click();
	}
	
	public static void clickOnUn()
	{
		BrowserUtil.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ContantUtil.UN);
	}
	
	public static void clickOnPsw()
	{
		BrowserUtil.driver.findElement(By.name("password")).sendKeys(ContantUtil.PSW,Keys.ENTER);
	}
	
	public static void clickOnPayNow()
	{
		BrowserUtil.driver.findElement(By.xpath("(//button[@class='btn btn-icon btn-block'])[2]")).click();
	}
	
	public static void clickOnWallet() throws InterruptedException
	{
		Thread.sleep(2000);
		BrowserUtil.driver.findElement(By.xpath("//span[.='Wallets / Cash Card']")).click();
	}
	
	public static void clickOnDropDown()
	{
		BrowserUtil.driver.findElement(By.xpath("(//i[@class='dropdown icon'])[2]")).click();
		BrowserUtil.driver.findElement(By.xpath("(//img[@src='/static/gateway/images/cashcards/oxigen.png'])[1]")).click();
		
       /* List<WebElement> element=BrowserUtil.driver.findElements(By.xpath("//div[@class='item']"));
		
		element.get(2).click();*/
	}
	
	public static void clickOnmakePayment() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("hi");
		BrowserUtil.driver.findElement(By.xpath("//button[@class='ui primary huge button']")).click();
	}


}
