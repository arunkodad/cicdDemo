package cicddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void LoadPage () {
		//System.setProperty("webdriver.chrome.driver","C:\\LEARNING\\MavenTestProjects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		//driver = new ChromeDriver ();
		
		driver =  new HtmlUnitDriver ();
		
		
		driver.get("https://www.google.co.in");
		
		driver.findElement (By.name("q")).sendKeys("Testing");
		
		
	}
	
}
