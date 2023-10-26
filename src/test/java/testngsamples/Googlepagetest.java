package testngsamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepagetest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get()
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox=driver.findElement(By.name("q"));
		//WebElement srcBox=driver.findElement(By.id("APjFqb"););
		//WebElement srcBox=driver.findElement(By.className("gLFyf"));
		//WebElement srcBox=driver.findElement(By.tagName("textarea"));
		srcBox.sendKeys("Selenium Turorial");
		//srcBox.submit();
		//Thread.sleep(2000);
		//List<WebElement>items=driver.findElements(By.xpath("))
		
	}
	

}
