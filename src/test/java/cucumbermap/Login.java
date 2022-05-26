package cucumbermap;

import java.util.Hashtable;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation_C;

public class Login 
{
	@When ("^user open \"(.*)\" browser with exe as$")
	public void user_open_browser_with_exe_as(String bname) throws Throwable
	{	
	    Object [] input=new Object[1];
	    input[0]=bname;
	    SeleniumOperation_C.browserLaunch(input);
	}

	 @When ("^user enter url as$")
	public void user_enter_URL_as() throws Throwable
	{
		SeleniumOperation_C.openApplication();
	}

	@When("^user cancle intitial login window$")
	public void user_cancle_intitial_login_window() throws Throwable 
	{
	
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation_C.clickOnElement(input2);
	}

	@When("^user navigate on login button$")
	public void user_navigate_on_login_button() throws Throwable
	{
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
	Hashtable<String,Object> output3=SeleniumOperation_C.mouseOver(input3);
	HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user navigate on login button$",output3.get("MESSAGE").toString());
	    
	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable
	{   Thread.sleep(8000);
		Object[] input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		Hashtable<String,Object> output4=SeleniumOperation_C.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on My Profile$",output4.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String username) throws Throwable
	{
		Object[] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]=username;
		Hashtable<String,Object> output5=SeleniumOperation_C.sendKeys(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$",output5.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String password) throws Throwable 
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=password;
		Hashtable<String,Object> output6=SeleniumOperation_C.sendKeys(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$",output6.get("MESSAGE").toString());
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Object[] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		Hashtable<String,Object> output7=SeleniumOperation_C.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user click on Login button$",output7.get("MESSAGE").toString());
	}

	@Then("^Application shows user profile to user$")
	public void valid() throws InterruptedException
	{   Thread.sleep(5000);
		Object[] input8=new Object[2];
		input8[0]="//*[@class='_1ruvv2']";
		input8[1]="Pallavi Jadhav";
		Hashtable<String,Object> output8=SeleniumOperation_C.validation(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^Application shows user profile to user$",output8.get("MESSAGE").toString());
	}

	/*@Then ("^Application shows appropriate error message$")
	public void invalid() throws InterruptedException 
	{   Thread.sleep(5000);
		Object[] input9=new Object[2];
		input9[0]="(//*[text()='Login'])[2]";
		input9[1]="Login";
		Hashtable<String,Object> output9=SeleniumOperation_C.validationForInvalid(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^user navigate on login button$",output9.get("MESSAGE").toString());
}
	
	
	
	
	
	/*@Then ("^browser close$")
	public void bclose() throws InterruptedException
	{
		Thread.sleep(5000);
		SeleniumOperation_C.browserClose();
	}
	@When ("^user enters (.+) as username$")
	public void usernameP (String givenu)
	{
		Object[] input10=new Object[2];
		input10[0]="(//*[@type='text'])[2]";
		input10[1]=givenu;
		SeleniumOperation_C.sendKeys(input10);
		
	}
	@When ("^user enters (.+) as password$")
	public void passwordP (String givenp)
	{
		Object[] input11=new Object[2];
		input11[0]="//*[@type='password']";
		input11[1]=givenp;
		SeleniumOperation_C.sendKeys(input11);
		
	}

	*/
}