package testngsamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripttest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String strtitle=(String)js.executeScript("return document.title");
		System.out.println(strtitle);
		WebElement schbox=(WebElement)js.executeScript("return document.getElementsByName('search')[0]");

	}

}
