package assignment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("u_6_b_JG")).sendKeys("test selenium");
		driver.findElement(By.xpath("u_6_d_TY")).click();
		driver.findElement(By.xpath("day")).click();
		Select sel= new Select(driver.findElement(By.xpath(",//""month")));
	 sel.SelectByVisible("sep"));
		
	Select sel1=new Select(	driver.findElement(By.xpath("year")));

	}

	private static Object ByVisibleText(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
