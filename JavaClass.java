import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaClass {

	public static WebDriver driver;
	public static WebElement element;

	public static void main(String[] args) {

		driver = new FirefoxDriver();
		driver.get("https://drive.google.com/uc?id=0B1RgR-ezIUEKV0g5RGFCQW9yaWs&export=download");

		String X = driver.findElement(By.id("next")).toString();
		System.out.println(X);
		driver.findElement(By.id("Email")).sendKeys("knvino");
		driver.findElement(By.id("Email")).sendKeys("knvino");
		driver.findElement(By.id("next")).click();
	

	}

}
