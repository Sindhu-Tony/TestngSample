package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltiptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				Actions actions=new Actions(driver);
				driver.manage().window().maximize();
				
				driver.get("https://jqueryui.com/tooltip/");
				WebElement frame1=driver.findElement(By.cssSelector(".demo-frame"));
				driver.switchTo().frame(frame1);
				WebElement inpAge=driver.findElement(By.id("age"));
				inpAge.sendKeys(Keys.PAGE_DOWN);
				actions.moveToElement(inpAge).perform();
				String str=driver.findElement(By.cssSelector("div.ui-tooltip-content")).getText();
				System.out.println(str);
				
					
				

	}

}
