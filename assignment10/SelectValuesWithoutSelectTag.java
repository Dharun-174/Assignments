package assignment10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectValuesWithoutSelectTag {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml;jsessionid=node0297llw43prfo1hkr9eef8nsf102385.node0");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary')]")).click();
		driver.findElement(By.xpath("//li[text()='Appium']")).click();
		driver.findElement(By.xpath("//li[text()='AWS']")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
	}

}
