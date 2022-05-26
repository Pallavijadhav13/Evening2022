package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable
{	
	@Before
	public void before (Scenario Scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\Report\\Flipkart.html","Flip");
		HTMLReportGenerator.TestCaseStart(Scenario.getName(),Scenario.getStatus());
		System.out.println("................................Scenario Start....................................");
	}
	@After
	public void after (Scenario Scenario)
	{
		System.out.println(".................................Scenario End......................................");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}
}

