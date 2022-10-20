package day1.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(650,450));
		//WebDriverWait wait=new WebDriverWait(driver,20);
		String pageTitle=driver.getTitle();
		System.out.println("pageTitle is:"+pageTitle);
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}
	}

	