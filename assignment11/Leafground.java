package assignment11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0526zxbpbwd1uw242gfmfdgl5104434.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement findElement = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tool=new Select(findElement);
		List<WebElement> list = tool.getOptions();
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		}
		tool.selectByVisibleText("Selenium");
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon-primary')]")).click();
		driver.findElement(By.xpath("//li[text()='Appium']")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("(//input[@role='textbox'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@role='textbox'])[1]")).sendKeys("DHARUNKUMAR");
		driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).sendKeys("Erode");
		driver.close();
				}


}
