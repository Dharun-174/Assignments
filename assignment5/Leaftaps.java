package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DHARUNKUMAR");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("DHARUN");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Qualification");
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
        driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("255-636");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("I'm Dharun from Tiruchengode");
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Hello everyone");
        driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("6564646646");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhakshinamoorthy");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kumar");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");  
        driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("75");
        driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TL@75");
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91"); 
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("211"); 
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0521"); 
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dharunkumard422@gmail.com");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9488083682");
        driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("DHARUN");
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/DharunkumarDhakshinamoorthy/Assignments");
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("ARAVINTHAN");
        driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3/42,2nd floor,Testleaf Softwares,Palavanthangal");
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600028");
        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("29");
        driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("PROJECT TL");
        driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Near Amman Temple");
        driver.findElement(By.className("smallSubmit")).click();
        }

}
