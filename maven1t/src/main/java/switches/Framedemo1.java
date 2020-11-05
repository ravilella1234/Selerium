package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo1
{
public static void main(String []args)
	{
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/");
	//driver.switchTo().frame(0);//the index no. is trial and error or
	driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	driver.switchTo().defaultContent();// we have to come out of the frame to go into other ones
	
	driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
	driver.findElement(By.linkText("Selenium")).click();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.name("classFrame")));
	driver.findElement(By.linkText("DefaultSelenium")).click();
	
	}
}
