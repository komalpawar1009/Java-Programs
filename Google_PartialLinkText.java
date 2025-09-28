package module1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_PartialLinkText {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();	
        driver.get("https://www.google.com");
       // WebElement e1 = driver.findElement(By.linkText("About"));
        WebElement e2 = driver.findElement(By.partialLinkText("Abo"));
        e2.click();
	}
}






