package in.aicpc.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.aicpc.generic.util.BrowserUtil;
import in.aicpc.generic.util.ContantUtil;
import in.aicpc.generic.util.ExcelLibUtil;
import in.aicpc.testcase.Institute_Member;
//import in.aicpc.testcase.ForStudent;

public class Aicpc_MemberInstitute_Script2 {
	@BeforeMethod
	public void openBrowser(){
		BrowserUtil.openBrowser();
	}
	@Test
	public void script2() throws InterruptedException
	{
		for(int i=25;i<=38;i++)
		{
			//System.out.println(ContantUtil.lastRowNum);
          String data = ExcelLibUtil.readData(ContantUtil.aicpcTestcasePath, "ForStudent", i, 2);
          System.out.println(data);
			
			if(data.equalsIgnoreCase("navigateToAicpc")){
				BrowserUtil.driver.get(ContantUtil.url);
			}
			
			if(data.equalsIgnoreCase("clickOnMemberInstitute"))
			{
				System.out.println("hi");
				Institute_Member.clickOnMemberInstitute();
			}
			
			if(data.equalsIgnoreCase("clickOnRegisterWithUs"))
			{
				Institute_Member.clickOnRegisterWithUs();
			}
			
			if(data.equalsIgnoreCase("clickOnBackBtn"))
			{
				Institute_Member.clickOnBackBtn();
			}
		
			if(data.equalsIgnoreCase("clickOnUn"))
			{
				Institute_Member.clickOnUn();
			}
			
			if(data.equalsIgnoreCase("clickOnPsw"))
			{
				Institute_Member.clickOnPsw();
			}
			
			if(data.equalsIgnoreCase("clickOnMyInstitute"))
			{
				Institute_Member.clickOnMyInstitute("Academic Details");
			}
			
			if(data.equalsIgnoreCase("clickOnSelectDropDown"))
			{
				Institute_Member.clickOnSelectDropDown();
			}
			
			if(data.equalsIgnoreCase("clickOnYear"))
			{
				Institute_Member.clickOnYear();
			}
			
			if(data.equalsIgnoreCase("clickOnIntake"))
			{
				Institute_Member.clickOnIntake();
			}
			
			if(data.equalsIgnoreCase("clickOnCourseDuration"))
			{
				Institute_Member.clickOnCourseDuration();
			}
			
			if(data.equalsIgnoreCase("clickOnFees"))
			{
				Institute_Member.clickOnFees();
			}
			
			if(data.equalsIgnoreCase("clickOnAddButton"))
			{
				Institute_Member.clickOnAddButton();
			}
		}
	}

}
