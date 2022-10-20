package day1.selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iedopen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","D:\\workspace\\Salenium\\executable\\IEDriverServer.exe");
		InternetExplorerDriver  edriver = new InternetExplorerDriver();

	}

}
