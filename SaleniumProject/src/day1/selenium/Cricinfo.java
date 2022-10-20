package day1.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExepath = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricinfo.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement>listOfmenu=driver.findElements(By.cssSelector("div[class=\"ds-relative\"]>nav"));
	
System.out.println("count:"+listOfmenu.size());
for(int i=0;i<listOfmenu.size();i++)
{
		System.out.println(listOfmenu.get(i).getText());
	}

}}
