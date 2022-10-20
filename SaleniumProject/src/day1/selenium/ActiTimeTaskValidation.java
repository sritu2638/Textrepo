package day1.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTaskValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", chromeExePath);
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://demo.actitime.com");
WebElement userNameInputField=driver.findElement(By.id("username"));
userNameInputField.clear();
userNameInputField.sendKeys("admin");

WebElement passwordField=driver.findElement(By.name("password"));
passwordField.sendKeys("manager");
WebElement loginButton=driver.findElement(By.id("loginButton"));
loginButton.click();
driver.findElement(By.id("container_task")).click();
List<WebElement>taskNames=driver.findElements(By.cssSelector(".taskRowsTable.name.title"));
List<String>taskList=new ArrayList<String>();
for(WebElement task:taskNames) {
	taskList.add(task.getText());
	
}
System.out.println(taskList.contains("3D modelling"));









	}

}
