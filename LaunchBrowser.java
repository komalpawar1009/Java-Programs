package module1;

import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();	
        driver.get("https://www.selenium.dev/about/");
        String title = driver.getTitle();
        System.out.println(title);
        String id = driver.getWindowHandle();
        driver.manage().window().maximize();
       
        System.out.println(id);
	}
	
}
