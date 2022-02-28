package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/java/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();

}
}
