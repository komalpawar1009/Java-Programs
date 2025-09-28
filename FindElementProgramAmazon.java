package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementProgramAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
        driver.get("https://www.amazon.in");
        driver.findElement(By.className("a-button-text")).click();
        WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("Mouse"+ Keys.ENTER);
		
		
	}

}
