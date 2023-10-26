package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.get("http://the-internet.herokuapp.com/login");
				driver.findElement(By.linkText("Element Selenium")).click();
				driver.findElement(By.partialLinkText("Selenium")).click();
	}

}
