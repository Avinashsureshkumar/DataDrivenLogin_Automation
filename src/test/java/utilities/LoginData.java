package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class LoginData {
@DataProvider(name = "logintest")
public String[][] getddata() throws IOException{
	    String path = System.getProperty("user.dir")+"\\test-data\\invalid_test_data.xlsx";
	    ExcelUtility excel = new ExcelUtility(path);
		int rowcount = excel.getRowCount("Sheet1");
		int cellcount = excel.getCellCount("Sheet1", 1);
		String logindata[][] = new String[rowcount][cellcount];
	    for(int i=1;i<=rowcount;i++)  
		{		
			for(int j=0;j<cellcount;j++) 
			{
				logindata[i-1][j]= excel.getCellData("Sheet1",i, j);  
			}
		}
	    return logindata;
	}


	}