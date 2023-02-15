package assignment10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRandomValues {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement mon=driver.findElement(By.id("month"));
		Select option=new Select(mon);
		List<WebElement> list = option.getOptions();
		int size = list.size();
		option.selectByIndex(size-5);
	}

}
