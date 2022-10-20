package day1.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sun.security.util.Password;

public class ActiTimeLogin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.actiTime.com/");
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		WebElement password=driver.findElement(By.name("pwd"));
		 password.sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		 
		 String expectededTitle="actiTIME - Enter Time-Track";
		 String actualTitle=driver.getTitle();
		 System.out.println("Excepted Title is:"+expectededTitle);
		 System.out.println("actual Title is: "+actualTitle);
		 if(actualTitle.equals(expectededTitle))
		 {
			 System.out.println("validation is passed");
		 }else {
			 System.out.println("validation is faild");
		 }
		 driver.findElement(By.id("logoutLink")).click();
		 driver.close();
		 
		
		
		

	}

}
