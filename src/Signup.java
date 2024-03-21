import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\PBA-1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pba1-292270-react.b292270.dev.eastus.az.svc.builder.cafe/");
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained network-btn btn-bold MuiButton-containedPrimary']")).click();
		driver.findElement(By.cssSelector("[name='full_name']")).sendKeys("Automated user");
		driver.findElement(By.xpath("//input[@placeholder='Johndoe@gmail.com']")).sendKeys("automate@gmail.com");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("Testing12");
		driver.findElement(By.cssSelector("[name='cpassword']")).sendKeys("Testing12");
	    WebElement dropdown = driver.findElement(By.id("mui-component-select-country"));
	   
	    
	   
	}

}
