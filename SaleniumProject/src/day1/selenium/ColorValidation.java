package day1.selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver","chromeExePath");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("http://demo.vtiger.com/vtigercrm/index.php");
WebElement signInButton=driver.findElement(By.cssSelector("button['type=submit']"));
System.out.println("font color:"+signInButton.getCssValue("color"));
System.out.println("font size:"+signInButton.getCssValue("font-size"));
System.out.println("background color:"+signInButton.getCssValue("background-image"));
WebElement forgotPasswordLink=driver.findElement(By.cssSelector("forgotPasswordLink"));
System.out.println("forgot password text color"+forgotPasswordLink.getCssValue("color"));

	}

}
