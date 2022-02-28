package week4.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/java/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		String windowaHandle = driver.getWindowHandle();
	    System.out.println("windowaHandle");
	    driver.findElement(By.id("home")).click();
	    Set<String>  windowHandles = driver.getWindowHandles();
	    List<String> list = new ArrayList<String>(windowHandles);
	    String secondWindow = list.get(1);
	    driver.switchTo().window(secondWindow);
	    System.out.println(secondWindow);
	    
	
	}
}
