package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("stbymkt@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("qwerty1234");
		WebElement loginbutton = driver.findElement(By.name("login"));
	    loginbutton.click();
	}

}
