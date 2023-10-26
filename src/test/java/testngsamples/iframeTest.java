package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver");
				String str1=driver.findElement(By.xpath("//label//span")).getText();
System.out.println(str1);
//from main page to frame1
driver.switchTo().frame("frame1");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Welcome");
//frame1 to frame3
driver.switchTo().frame("frame3");
driver.findElement(By.id("a")).click();
 //from frame3 to frame1
driver.switchTo().parentFrame();
driver.findElement(By.xpath("//input[@type='text']")).clear();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome back");

	}

}
