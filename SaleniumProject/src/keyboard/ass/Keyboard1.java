package keyboard.ass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",chromeExePath);
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.flipkart.com");
driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	}

}
