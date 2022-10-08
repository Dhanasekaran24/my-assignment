package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xxx");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("dhanasekaran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkatesan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("dhana");
		driver.findElement(By.name("departmentName")).sendKeys("b.com");
		driver.findElement(By.name("description")).sendKeys("abcdef");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhanasekaran@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("testleaf");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("dhanush");
		driver.findElement(By.className("smallSubmit")).click();
		String t = driver.getTitle();
		System.out.println(t);
		
	}

}
