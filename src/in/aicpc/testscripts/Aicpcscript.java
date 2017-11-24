package in.aicpc.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import in.aicpc.generic.util.BrowserUtil;
import in.aicpc.generic.util.ContantUtil;
import in.aicpc.generic.util.ExcelLibUtil;
import in.aicpc.testcase.ForStudent;

@Listeners(in.aicpc.generic.util.SampleReport.class)
public class Aicpcscript {
	@BeforeMethod
	public void openBrowser(){
		BrowserUtil.openBrowser();
	}
	@Test
	public void script() throws InterruptedException{
		for(int i = 0 ; i<=11; i++){
			String data = ExcelLibUtil.readData(ContantUtil.aicpcTestcasePath, "ForStudent", i, 2);
			
			if(data.equalsIgnoreCase("navigateToAicpc")){
				BrowserUtil.driver.get(ContantUtil.url);
			}
			
			if(data.equalsIgnoreCase("forStudent")){
				ForStudent.forStudent();
			}
			
			if(data.equalsIgnoreCase("clickOnApply")){
				ForStudent.clickOnApply();
			}
			
			if(data.equalsIgnoreCase("clickOnStratNow")){
				ForStudent.clickOnStratNow();
			}
			
			
			if(data.equalsIgnoreCase("clickOnBackBtn")){
				ForStudent.clickOnBackBtn();
			}
			
			if(data.equalsIgnoreCase("clickOnUn")){
				ForStudent.clickOnUn();
			}
			
			if(data.equalsIgnoreCase("clickOnPsw")){
				ForStudent.clickOnPsw();
			}
			
			if(data.equalsIgnoreCase("clickOnPayNow")){
				ForStudent.clickOnPayNow();
				
			}
			
		//	if(data.equalsIgnoreCase("clickOnDropDown")){
		//		ForStudent.clickOnDropDown();
		//	}
			
			//if(data.equalsIgnoreCase("makepayment")){
				//ForStudent.clickOnmakePayment();
			//}
		}
	}
//	@AfterMethod
//	public void closeBrowser(){
//		BrowserUtil.closeBrowser();
//	}
}
