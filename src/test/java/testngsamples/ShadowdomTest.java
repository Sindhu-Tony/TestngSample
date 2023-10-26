package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowdomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement shadowHost=driver.findElement(By.cssSelector("#shadow_host"));
	SearchContext shadowRoot = shadowHost.getShadowRoot();
	WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
	System.out.println(shadowContent.getText());

	}

}
