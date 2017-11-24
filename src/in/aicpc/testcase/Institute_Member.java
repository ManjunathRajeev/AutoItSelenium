package in.aicpc.testcase;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import in.aicpc.generic.util.BrowserUtil;
import in.aicpc.generic.util.ContantUtil;

public class Institute_Member {
	public static void navigateToAicpc()
	{
		BrowserUtil.driver.get(ContantUtil.url);
	}
	
	public static void clickOnMemberInstitute()
	{
		
		WebElement element = BrowserUtil.driver.findElement(By.xpath("//a[text() = 'Member Institutes']"));
		
		WebDriverWait wait = new WebDriverWait(BrowserUtil.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Member Institutes']")));
		element.click();
	}
	
	public static void clickOnRegisterWithUs()
	{
		RemoteWebDriver script =  (RemoteWebDriver)BrowserUtil.driver;
		script.executeScript("window.scroll(0,2000)");
		BrowserUtil.driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
		
	}
	
	public static void clickOnBackBtn() throws InterruptedException
	{
		Set<String> set = BrowserUtil.driver.getWindowHandles();
		Iterator<String> it  = set.iterator();
		String PWID = it.next();
		String CWID = it.next();
		BrowserUtil.driver.switchTo().window(CWID);
		Thread.sleep(2000);
		
		System.out.println(BrowserUtil.driver.getTitle());
		System.out.println(BrowserUtil.driver.getCurrentUrl());
		
		WebElement element = BrowserUtil.driver.findElement(By.xpath("//a[@class='btn btn-light-grey go-back']"));
		WebDriverWait wait =new WebDriverWait(BrowserUtil.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		Thread.sleep(5000);
		System.out.println(BrowserUtil.driver.getCurrentUrl());
		
	}
	
	public static void clickOnUn()
	{
		WebDriverWait wait = new WebDriverWait(BrowserUtil.driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']"))).sendKeys(ContantUtil.UN1);
		}
	
	public static void clickOnPsw()
	{
		BrowserUtil.driver.findElement(By.name("password")).sendKeys(ContantUtil.PSW1,Keys.ENTER);
	}
	
	public static void clickOnMyInstitute(String elementToSelect) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement institute = BrowserUtil.driver.findElement(By.xpath("//span[text()=' My Institute']"));
		/*RemoteWebDriver executor = (RemoteWebDriver)BrowserUtil.driver;
		 
				
		executor.executeScript("arguments[0].click();", institute);
		System.out.println("institute");
		//institute.click();
		Thread.sleep(10000);
		
		selectElement(elementToSelect);
	*/
		Actions actions=new Actions(BrowserUtil.driver);
		actions.moveToElement(institute).click().perform();
		
	}
		
		public static void selectElement(String elementToSelect )
		{
			BrowserUtil.driver.findElement(By.xpath("//span[contains(.,'"+elementToSelect+"')]")).click();
		}
		
		
		
		
	
	
	public static void clickOnSelectDropDown()
	{
		List<WebElement> ele=BrowserUtil.driver.findElements(By.xpath("//span[text()=' General Information']/../../../..//ul"));
		ele.get(2).click();
	}
	
	public static void clickOnYear()
	{
		BrowserUtil.driver.findElement(By.id("start_year")).click();
	}
	
	public static void clickOnIntake()
	{
		BrowserUtil.driver.findElement(By.id("intake")).click();
	}
	
	public static void clickOnCourseDuration()
	{
		BrowserUtil.driver.findElement(By.id("course_duration")).click();
	}
	
	public static void clickOnFees()
	{
		BrowserUtil.driver.findElement(By.id("fees")).click();
	}
	
	public static void clickOnAddButton()
	{
		BrowserUtil.driver.findElement(By.xpath("//button[.='Add'].click()")).click();
	}

}
