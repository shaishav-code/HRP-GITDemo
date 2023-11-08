package TestCases;

import org.junit.experimental.theories.Theories;
import org.testng.annotations.Test;

import resources.BaseClass;

public class TC_e2e extends BaseClass{
	
	@Test
	public void BasePageNavigation() throws InterruptedException
	{
		e1.from_text();
		Thread.sleep(2000);
		e1.from_option();
		Thread.sleep(2000);
		e1.to_option();
		Thread.sleep(2000);
		//e1.calendar_click();
		e1.next_click();
		Thread.sleep(2000);
		e1.dateselect();
		Thread.sleep(2000);
		e1.passDropDown();
		Thread.sleep(2000);
		e1.plus_click();
		Thread.sleep(2000);
		e1.done_click();
		Thread.sleep(2000);
		e1.currencyDropDown();
		Thread.sleep(2000);
		e1.search_click();
	}
}
