package day1.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitOrangeCRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String pageTitle=driver.getTitle();
		System.out.println("page title is: "+pageTitle);
		System.out.println("page Title length is"+pageTitle.length());
		System.out.println("page Title status is:"+pageTitle.equals("OrangeHRM"));
        String pageURL=driver.getCurrentUrl();
        System.out.println("page url is:"+pageURL);
        System.out.println("page url status is: "+pageURL.contains("http://opensource-demo.orangehrmlive.com"));
       String pageContent=driver.getPageSource();
       System.out.println("page source length:"+pageContent.length());
       WebElement usernameInputField=driver.findElement(By.name("username"));
       usernameInputField.sendKeys("Admin");
       WebElement passwordInputField=driver.findElement(By.name("password"));
       usernameInputField.sendKeys("Admin123");
       WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
       loginButton.click();
       String homePageUrl=driver.getCurrentUrl();
       System.out.println("home page validation status is:"+homePageUrl.contains("viewEmployeeList"));
       driver.close();

	}

}
