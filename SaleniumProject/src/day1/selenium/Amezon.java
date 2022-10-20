package day1.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		System.out.println("Actual url is: "+actualUrl);
		System.out.println("Actual Title is: "+actualTitle);
		String exceptedUrl="https://www.amazon.in/";
		String exceptedTitle="Amezon-login";
		System.out.println("URl validation is"+actualUrl.equals(exceptedUrl));
		System.out.println("Title validation is"+actualTitle.equals(exceptedTitle));
		String pageSource=driver.getPageSource();
		System.out.println("page source length:"+pageSource.length());
		System.out.println("page source content"+pageSource);
		//driver.close();
		
		
		
	}
	
}
			