package week2day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {
       public static void main(String[] args) {
		
    	   WebDriverManager.chromedriver().setup();
    	   
    	   ChromeDriver driver = new ChromeDriver();
    	   driver.get("http://leaftaps.com/opentaps/control/main");
    	   driver.manage().window().maximize();
    	   driver.findElement(By.id("username")).sendKeys("demosalesManager");
    	   driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
    	   driver.findElement(By.className("decorativeSubmit")).click();
           driver.findElement(By.linkText("CRM/SFA")).click();
           driver.findElement(By.linkText("Leads")).click();
           driver.findElement(By.linkText("Create Lead")).click();
           driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
           driver.findElement(By.id("createLeadForm_firstName")).sendKeys("dhanasekaran");
           driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkatesan");
           driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("dhana");
           driver.findElement(By.name("departmentName")).sendKeys("b.com");
           driver.findElement(By.className("inputBox")).sendKeys("nonit-it");
           driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhanadhanush2324@gmail.com");
           driver.findElement(By.className("smallSubmit")).click();
           String title = driver.getTitle();
            System.out.println(title);
	}
}
