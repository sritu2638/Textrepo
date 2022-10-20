package day1.selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://thompsonsj.com/bootstrap-select-dropdown");
		WebDriverWait Wait = new WebDriverWait(driver,20);
		WebElement dropdown=driver.findElement(By.id("id=\"bsd1-button\""));
		dropdown.click();
		List <WebElement>option =driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		System.out.println("option count:"+option.size());
		for(int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
			}
		}

}
