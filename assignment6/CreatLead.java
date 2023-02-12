package assignment6;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatLead {
	
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
			driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TESTLEAF");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("DHARUNKUMAR");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhakshinamoorthy");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DHARUN");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Domain");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("I'm Dharun from Tiruchengode");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dharunkumard422@gmail.com");
			WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select selectState=new Select(state);
			selectState.selectByVisibleText("New York");
			driver.findElement(By.name("submitButton")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			System.out.println("Title is:"+ driver.getTitle());
			}

	}


