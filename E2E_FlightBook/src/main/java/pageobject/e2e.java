package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public WebDriver driver;
	
	public e2e(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Dynamic drop-down - Select From and To destination
	@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement from_txt;
	
	public void from_text() 
	{
		from_txt.click();
	}
	
	//Select From destination
	@FindBy(xpath = "//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")
	WebElement from_opt;
	
	public void from_option()
	{
		from_opt.click();
	}
	
	//Select To destination
	@FindBy(xpath ="//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")
	WebElement to_opt;
	
	public void to_option() 
	{
		to_opt.click();
	}
		
	//Click on calendar
//		@FindBy(xpath = "//input[@id='ctl00_mainContent_view_date1']")
//		WebElement first_calendar;
//		
//		public void calendar_click() 
//		{
//			first_calendar.click();
//		}
	
	// ********************** One Way *************************
	//Click on next button
	@FindBy(xpath = "//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/a")
	WebElement nextclick;
	
	public void next_click()
	{
		nextclick.click();
	}
	
	//Select date
	@FindBy(xpath ="//div[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]")
	WebElement onewayDateSelect;
	 
	public void dateselect() {
		
		onewayDateSelect.click();
	}
	
	//Passengers drop-down - Updated dropdown
	@FindBy(id="divpaxinfo")
	WebElement updatedDropdown;
	
	public void passDropDown()
	{
		updatedDropdown.click();
	}
	
	@FindBy(id="hrefIncAdt")
	WebElement plus_btn;
	
	public void plus_click() 
	{
		System.out.println(updatedDropdown.getText()); //Get text of already selected passenger
		/*int i=1;
		while(i<5)
		{
			plus_btn.click();
			i++;
		}*/
		for(int i=1;i<5;i++)
		{
			plus_btn.click();
		}
	}
	
	@FindBy(id="btnclosepaxoption")
	WebElement done_btn;
	
	public void done_click() throws InterruptedException {
		done_btn.click();
		Thread.sleep(2000);
		Assert.assertEquals(updatedDropdown.getText(), "5 Adult"); //To compare or chacke that 5 adult are not
		//System.out.println(updatedDropdown.getText()); //Get text of increased selected passenger
	}
	
	//Select dropdown with select tag - static drop-down
	@FindBy(id="ctl00_mainContent_DropDownListCurrency")
	WebElement staticDropdown;
	
	public void currencyDropDown() {
		
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3); //Select option using index 
		System.out.println( dropdown.getFirstSelectedOption().getText());
	}
	
	//Click on Search button
	@FindBy(xpath = "//input[@id='ctl00_mainContent_btn_FindFlights']")
	WebElement search_btn;
	
	public void search_click() 
	{
		search_btn.click();
	}	
}
