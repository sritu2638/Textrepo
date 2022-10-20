package day1.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmaerna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExepath = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement>mobileNameList=driver.findElements(By.cssSelector("div[class=\"makers\"]>ul>li>a>strong>span"));
System.out.println("count:"+mobileNameList.size());
	for(int i=0;i<mobileNameList.size();i++){
		
	System.out.println(mobileNameList.get(i).getText());
	
}
	}
}