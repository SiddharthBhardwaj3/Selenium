package testcase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class testclass {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Siddharth");
		
	}
}
