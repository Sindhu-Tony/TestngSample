package testngsamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.opencart.com/");
				TakesScreenshot screen=(TakesScreenshot)driver;
				File img=screen.getScreenshotAs(OutputType.FILE);
				try
				{
					FileUtils.copyFile(img,new File(System.getProperty("user.dir")
							+ "//screenshots//"
							+ "fullscreen.png"));
				}
					catch(IOException e)
					{
						e.printStackTrace();
						
					}
				
				WebElement ele=driver.findElement(By.cssSelector("div#logo"));
				File imgEle =ele.getScreenshotAs(OutputType.FILE);
				try
				{
					FileUtils.copyFile(imgEle,new File(System.getProperty("user.dir")
							+ "//screenshots//"
							+ "Elementscreen1.png"));
				}
					catch(IOException e)
					{
						e.printStackTrace();
						
					}
				
	}


}
