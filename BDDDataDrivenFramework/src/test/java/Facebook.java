import com.AutomationFramework.Common.ExcelManager;
import com.AutomationFramework.Common.PropertyFileManager;
import com.AutomationFramework.Common.ReportManager;
import com.AutomationFramework.Common.TestIDSetupManager;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReportManager.getInstace().initializeReport();
		ExcelManager.getInstace()
				.setTestData("E:\\SpringWorkspace\\BDDDataDrivenFramework\\ExcelSheets\\TestData.xlsx");
		TestIDSetupManager.getInstace().setTestID("Test2");
		PropertyFileManager.getInstace()
				.RespositoryParser("E:\\SpringWorkspace\\BDDDataDrivenFramework\\PropertyFiles\\PF1.properties");
		
		
	}
}
