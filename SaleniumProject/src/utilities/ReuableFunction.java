package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuableFunction {
static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =setUp("chrome","http://www.google.com");
		System.out.println(driver.getTitle());
		cleanUp();	
	}
static WebDriver setUp(String browserName,String url)
{
	String exePath;
	if(browserName.equalsIgnoreCase("chrome")) {
		exePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		driver =new ChromeDriver();
		
	}else if(browserName.equalsIgnoreCase("firefox")) {
		exePath=System.getProperty("user.dir")+"\\executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",exePath);
		driver=new FirefoxDriver();
	}else
}

}
