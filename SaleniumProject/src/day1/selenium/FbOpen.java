package day1.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class FbOpen {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String actualUrl=driver.getCurrentUrl();
String actualTitle=driver.getTitle();
System.out.println("Actual Url is:"+actualUrl);
System.out.println("actual title is:"+actualTitle);
String exceptedUrl="https://www.facebook.com/";
String execptedTitle="facebook login";

System.out.println("URL validation:"+actualUrl.equals(exceptedUrl));
System.out.println("Title validation is:"+actualTitle.equals(execptedTitle));
String pageSource=driver.getPageSource();
System.out.println("page source length"+pageSource.length());
System.out.println("page source content:"+pageSource);
//driver.close();


	}

}
