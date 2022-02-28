package week4.day2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass3Frames {
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();  
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver"); 
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//body//b[@id='topic']/following-sibling::input")).sendKeys("Jagadeesh");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		WebElement checkbox= driver.findElement(By.xpath("//input[@id='a']"));
		
		Boolean selected = checkbox.isSelected();
		System.out.println(selected);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		
		String dp = dropdown.getText();
		System.out.println(dp);
}
}