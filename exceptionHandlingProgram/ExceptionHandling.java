package exceptionHandlingProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {


	public static void main(String[] args) throws InterruptedException {


	

			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");

			driver.findElement(By.id("user-name")).sendKeys("visual_user");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("(//div[@class='login-box']//input)[3]")).click();

			driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
			String price = driver.findElement(By.className("inventory_details_price")).getText();
			System.out.println("Price of Backpack " + price);

			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			driver.findElement(By.className("shopping_cart_link")).click();

			driver.findElement(By.xpath("//button[text()='Continue Shopping']/following::button")).click();
			driver.findElement(By.id("first-name")).sendKeys("Leaf");
			driver.findElement(By.id("last-name")).sendKeys("Tree");
			driver.findElement(By.name("postalCode")).sendKeys("600114");
			driver.findElement(By.xpath("//button[text()='Cancel']/following-sibling::input")).click();
			String sauceCard = driver.findElement(By.xpath("//div[text()='Payment Information:']/following-sibling::div"))
					.getText();
			System.out.println(sauceCard);
			driver.findElement(By.xpath("//button[text()='Finish']")).click();
			String OrderSuccess = driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
			System.out.println(OrderSuccess);
			driver.quit();



		
	}
}







