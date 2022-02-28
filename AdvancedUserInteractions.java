package week4.day2;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedUserInteractions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/java/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		String windowaHandle = driver.getWindowHandle();
	    System.out.println(windowaHandle);
	    driver.findElement(By.id("home")).click();
	    Set<String>  windowHandles = driver.getWindowHandles();
	    ArrayList<String> list = new ArrayList<>(windowHandles);
	    String secondWindow = list.get(1);
	    driver.switchTo().window(secondWindow);
	    System.out.println(secondWindow);
	    driver.findElement(By.xpath("//h5[contains(text(),'Edit')]"));
	    driver.quit();
}
}
