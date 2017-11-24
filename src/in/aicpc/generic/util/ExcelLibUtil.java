package in.aicpc.generic.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibUtil {

	public static String readData(String filePath, String sheetname,int rownum, int cellnum) {
        String data = null;
        
        try{
        
        Workbook wb=WorkbookFactory.create(new FileInputStream(filePath));
        data=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
        }catch(Exception e){
        
    }
        return data;
    }
	
public static int lastRowNum(String filepath,String sheetName)
{
	int lastRowNum=0;
	try
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream(filepath));
		lastRowNum=wb.getSheet(sheetName).getLastRowNum();
	}
	
	catch(Exception e)
	{
		
	}
	return lastRowNum;
	}
}
