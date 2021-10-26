package com.qtpselenium.test;

import org.apache.log4j.Logger;

import com.qtpselenium.xls.read.Excel_Reader;

public class DriverScript {
	
	public Excel_Reader suiteXLS;
	
	public Logger APP_LOGS;
	
	public String current_Suite_Xls;
	public Excel_Reader currentXLS;
	public int currentTCID;
	public String currentTestcaseName;
	public int currentTestcaseID;
	public String currentKeyword;
	
	public static void main(String[] args) {
		DriverScript test = new DriverScript();
		test.start();
		
	}
		
	
	public void start() {
		APP_LOGS = Logger.getLogger("devpinoyLogger");
		APP_LOGS.debug("Start Logs");
		
		APP_LOGS.debug("Initialize Suite Xlsx");		
		suiteXLS = new Excel_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\Suite.xlsx");
		
		
		for(Constants.Sheet_Rnum =2;Constants.Sheet_Rnum<=suiteXLS.getRowCount(Constants.Suite_Name);Constants.Sheet_Rnum++) {
			
			APP_LOGS.debug(suiteXLS.getCellData(Constants.Suite_Name, Constants.Suite_TSID, Constants.Sheet_Rnum));
			APP_LOGS.debug(suiteXLS.getCellData(Constants.Suite_Name, Constants.Suite_Runmode, Constants.Sheet_Rnum));
			if(suiteXLS.getCellData(Constants.Suite_Name, Constants.Suite_Runmode, Constants.Sheet_Rnum).equals(Constants.Runmode_Value)) {
				// Execute individual Test Suite
				APP_LOGS.debug("Execute test Suite" +"\n");
				
				current_Suite_Xls = suiteXLS.getCellData(Constants.Suite_Name, Constants.Suite_TSID, Constants.Sheet_Rnum)+".xlsx";
				//System.out.println("Current Suite is : "+ current_Suite_Xls);
				
				currentXLS = new Excel_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\"+current_Suite_Xls);
				System.out.println("Current Suite is : "+ current_Suite_Xls+"*******************************Current Suite");
				
			
				for(currentTCID=2; currentTCID<=currentXLS.getRowCount(Constants.Suite_TC_Name);currentTCID++ ) {	
					currentTestcaseName = currentXLS.getCellData(Constants.Suite_TC_Name, Constants.Suite_TCID, currentTCID);
					System.out.println("current test case is :" +currentTestcaseName+"---------------------Current Test Case");
					
		//			if(currentXLS.getCellData(Constants.Suite_TC_Name, Constants.Suite_Runmode,currentTCID).equals(Constants.Runmode_Value)){
						
		//			System.out.println(currentXLS.getCellData(Constants.Suite_TC_Name, Constants.Suite_TCID, currentTCID)+"---------???");	
		//			}
					if(currentXLS.isSheetExist(currentTestcaseName)) {
					for(int i=0;i<currentXLS.getRowCount(currentTestcaseName);i++) {
						
						if(currentXLS.getCellData(currentTestcaseName, Constants.Suite_Runmode, i).equals(Constants.Runmode_Value)) {
							
						  System.out.println(currentXLS.getCellData(currentTestcaseName, 0, i));
						  executeKeywords();
					}
					
					
				}
					
				}else {
					executeKeywords();
					
				}
					
			}
				
      }
	}
}
	
	public void executeKeywords() {
		for(currentTestcaseID=2;currentTestcaseID<=currentXLS.getRowCount(Constants.TestSuite_TestSteps);currentTestcaseID++) {
			
			if(currentXLS.getCellData(Constants.TestSuite_TestSteps, Constants.Suite_TCID, currentTestcaseID).equals(currentTestcaseName))	
			{
				currentKeyword = currentXLS.getCellData(Constants.TestSuite_TestSteps, Constants.TestSteps_Keyword, currentTestcaseID);
				System.out.println(currentKeyword);
			}
		}
		
	}
	}
	