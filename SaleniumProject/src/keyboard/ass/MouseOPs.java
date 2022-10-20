package keyboard.ass;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.globalsqa.com/demo-site");
		List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("main menu option count:"+mainMenu.size());
		Actions act=new Actions(driver);
		//act.moveToElement(mainMenu.get(4)).perform();
		//for(int i=0;i<mainMenu.size();i++){
		//WebElement option=mainMenu.get(i);
		//act.moveToElement(option).perform();
		//Thread.sleep(1000);
	//}
//mouseHoverOverTheElement(act,mainMenu.get(2));
		//mouseHover(act,mainMenu);
		//act.moveToElement(mainMenu.get(2),100,0).perform();
		//mouseHoverWithCords(act , mainMenu.get(1),100,0);
		rightClick(act,mainMenu.get(1));
		}
static void mouseHoverOverTheElement(Actions act,WebElement element) {
	act.
			
	}
	
	}


