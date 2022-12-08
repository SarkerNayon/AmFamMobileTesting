package santnderDDTest;

import org.testng.annotations.Test;

import com.pages.CovidResource;
import base.BaseClass;

public class TestRuner extends BaseClass{
	CovidResource cResource = new CovidResource(driver);
	
	@Test
	public void sampleTest() {
		cResource.alrtHandle(driver);
		cResource.scrDown(driver);
		cResource.covidResponseButton(driver);
	}
	

}
