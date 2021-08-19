package pages;

import org.testng.annotations.BeforeTest;

import utilities.TestBase;

public class PageObject extends TestBase
{
	//--------------------------------Objects of Page Factory--------------------------------------------------
	@BeforeTest
	public static void PageFactoryObject()
	{

		//countSheep countSheepobject=new countSheep(driver);
		SeleniumTask seleniumTaskobject = new SeleniumTask(driver);
	}

}
