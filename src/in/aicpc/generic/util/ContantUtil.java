


package in.aicpc.generic.util;

public interface ContantUtil {
	String aicpcexcelPath="C:\\Users\\Vidya Shree\\Desktop\\aicpcexcel.xlsx";
	String aicpcTestcasePath="C:\\Users\\Vidya Shree\\Desktop\\Testcase.xlsx";
	
	String browser=ExcelLibUtil.readData(ContantUtil.aicpcexcelPath,"Sheet1", 1, 1);
	String browserDriver=ExcelLibUtil.readData(ContantUtil.aicpcexcelPath, "Sheet1", 1, 2);
	String browserDriverPath=ExcelLibUtil.readData(ContantUtil.aicpcexcelPath, "Sheet1", 1, 3);
	
	String url=ExcelLibUtil.readData(ContantUtil.aicpcexcelPath, "Sheet1", 1, 4);
	String FirefoxBrowser="Firefox";
	String UN = ExcelLibUtil.readData(ContantUtil.aicpcTestcasePath, "ForStudent", 7, 3);
	String PSW=ExcelLibUtil.readData(ContantUtil.aicpcTestcasePath, "ForStudent", 8, 3);		
	
	String UN1 = ExcelLibUtil.readData(ContantUtil.aicpcTestcasePath, "ForStudent", 29, 3);
	String PSW1=ExcelLibUtil.readData(ContantUtil.aicpcTestcasePath, "ForStudent", 30, 3);		
	
	
	
	int lastRowNum = ExcelLibUtil.lastRowNum(ContantUtil.aicpcTestcasePath, "ForStudent");
}
