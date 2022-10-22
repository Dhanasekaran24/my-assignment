package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The size is : "+ windowHandles.size());
		List<String> wind = new ArrayList<String>(windowHandles);
		driver.switchTo().window(wind.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(wind.get(1));
		driver.close();
		driver.switchTo().window(wind.get(0));
	}

}
