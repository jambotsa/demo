package individual.codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class code1 {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		// launch Firefox and direct it to the URL
		driver.get("http://ecommerce.saipratap.net/");

		// maximise the window
		driver.manage().window().maximize();

		// Locate the elements
		driver.findElement(By.xpath("//a[@href='tracking.php']")).click();
		// wait for 3 seconds until u perform next action
		Thread.sleep(3000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='cart.php']")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//a[@href='brands.php']")).click();
		driver.navigate().back();
		// driver.close();

	}

}
