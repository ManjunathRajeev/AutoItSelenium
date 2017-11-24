package in.aicpc.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.aicpc.generic.util.BrowserUtil;
import in.aicpc.generic.util.ContantUtil;
import in.aicpc.generic.util.ExcelLibUtil;
import in.aicpc.testcase.ForStudent;
import in.aicpc.testcase.ForStudent_Wallet;

public class AicpcScript1 {
	@BeforeMethod
	public void openBrowser(){
		BrowserUtil.openBrowser();
	}
	@Test
	public void script1() throws InterruptedException{
		for(int i =13 ; i<=23; i++){
			String data = ExcelLibUtil.readData(ContantUtil.aicpcTestcasePath, "ForStudent", i, 2);
			
			if(data.equalsIgnoreCase("navigateToAicpc")){
				BrowserUtil.driver.get(ContantUtil.url);
			}
			
			if(data.equalsIgnoreCase("forStudent")){
				ForStudent_Wallet.forStudent();
			}
			
			if(data.equalsIgnoreCase("clickOnApply")){
				ForStudent_Wallet.clickOnApply();
			}
			
			if(data.equalsIgnoreCase("clickOnStratNow")){
				ForStudent_Wallet.clickOnStratNow();
			}
			
			if(data.equalsIgnoreCase("clickOnBackBtn")){
				ForStudent_Wallet.clickOnBackBtn();
			}
			
			if(data.equalsIgnoreCase("clickOnUn")){
				ForStudent_Wallet.clickOnUn();
			}
			
			if(data.equalsIgnoreCase("clickOnPsw")){
				ForStudent_Wallet.clickOnPsw();
			}
			
			if(data.equalsIgnoreCase("clickOnPayNow")){
				ForStudent_Wallet.clickOnPayNow();
			}
			
			if(data.equalsIgnoreCase("clickOnWallet"))
			{
				ForStudent_Wallet.clickOnWallet();
			}
			
			if(data.equalsIgnoreCase("clickOnDropDown")){
				ForStudent_Wallet.clickOnDropDown();
			}
			
			if(data.equalsIgnoreCase("clickOnmakePayment")){
				ForStudent_Wallet.clickOnmakePayment();
			}
		}

	}
}
