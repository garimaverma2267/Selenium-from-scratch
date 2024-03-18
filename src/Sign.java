import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Sign {
	
	private WebDriver driver;
	
	public Sign() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MY PC\\eclipse-workspace\\PBA-1\\driver\\chromedriver.exe");	
			this.driver = new ChromeDriver();	
			invokeBrowser();
			implicitWait();			
	}
	public void invokeBrowser() {
		driver.get("https://pba1-292270-react.b292270.dev.eastus.az.svc.builder.cafe/");
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();	
		signinBlock();	
		
	}
	
    public void implicitWait(){
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
	public void signinBlock() {
		
		driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root')]")).click();
		driver.findElement(By.xpath("(//img[@class='logo-image-signup'])[2]")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'MuiInputBase-input ') and contains(@class, 'MuiOutlinedInput-input')]")).sendKeys("vani@gmail.com");
		driver.findElement(By.xpath(" //input[@placeholder='xxxxxxxxxx']")).sendKeys("Testing12");
		driver.findElement(By.name("rememberMe")).click();
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		implicitWait();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("vani");
		driver.findElement(By.xpath("//div[@class='chip-box']//div[1]")).click();
		homepage();
	    notification();
	    homepage();
//	    createPost();
	}
	
	public void homepage() {
		driver.findElement(By.xpath("//span[@class='MuiBadge-root header_icon_first']")).click();
	    
	}
	
	public void createPost() {
		driver.findElement(By.xpath("//p[@class='MuiTypography-root inputField attachmentText MuiTypography-body1']")).click();
		implicitWait();
		driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl MuiInputBase-multiline MuiInput-multiline']//textarea")).sendKeys("Automate create post");
		implicitWait();
		driver.findElement(By.xpath("////p[@class='MuiTypography-root descText MuiTypography-body1'][normalize-space()='Attachment']")).click();
	}
	public void notification () {
	
		driver.findElement(By.xpath("//span[@class='MuiBadge-root header_icon_second']")).click();
		
		String read = "Read";
		String unread = "Unread";
		
		WebElement firstnoti = driver.findElement(By.xpath("//div[@class='MuiGrid-root notify-content-box MuiGrid-container']//div[1]"));
		System.out.println("Garima verma ");
		
	    String noticlassvalue = firstnoti.getAttribute("class");
	    
	    if(noticlassvalue.equals("notification-box-unread")) {
	    	System.out.println("UNREAD BLOCK ");
	    	 driver.findElement(By.xpath("//div[@class='MuiGrid-root notify-content-box MuiGrid-container']//div[1]//div[2]")).click();
	    	 driver.findElement(By.xpath("//div[@class='MuiGrid-root notify-content-box MuiGrid-container']//div[1]//div[2]//p")).click();
	    	
	    }
	    else {
	    	System.out.println("READ BLOCK ");
	    	 driver.findElement(By.xpath("//div[@class='MuiGrid-root notify-content-box MuiGrid-container']//div[1]//div[2]")).click();
	    	 driver.findElement(By.xpath("//div[@class='MuiGrid-root notify-content-box MuiGrid-container']//div[1]//div[2]//p")).click();
	    	
	    }

	}
	
	
	
	public void logout() {
		driver.findElement(By.xpath("//div[@class='Authore_img_main']//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault']")).click();
		driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'][3]")).click();
	}
	public void closeBrowser() {
		driver.close();
	}
	
	public static void main(String[] args){
		Sign signin = new Sign();
		

	}
		
}
