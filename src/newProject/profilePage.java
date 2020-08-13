package newProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class profilePage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/floratechno/Downloads/selenium-java-3/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  WebElement root1 = driver.findElement(By.className("vm-profile-information"));
		  
		  driver.get("https://stable.videomine.io");
		
		driver.findElement(By.className("js-email-id")).sendKeys("shewalesayali792@gmail.com");
	      Thread.sleep(300);
	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).sendKeys("MyAim@life1");
	      driver.findElement(By.className("js-sign-in")).click();
	      Thread.sleep(8000);
	      driver.findElement(By.className("js-profile")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("myProfile")).click();
	      Thread.sleep(8000); 
	      System.out.println("1");
//	      driver.findElement(By.className("js-user-name")).sendKeys("shewalesayali");
//	       driver.findElement(By.className("js-user-first-name")).sendKeys("shewalesayali");
//	      driver.findElement(By.className("main-profile-info-wrapper"));
	     
	      WebElement temp = expandRootElement(root1);
	      
	      System.out.println(temp);
	      Thread.sleep(2000);
	      driver.findElement(By.className("js-update-profile-info")).click();
	}
	
	
	public static WebElement expandRootElement(WebElement element) {
		WebDriver driver = new ChromeDriver();
		WebElement ele = (WebElement) ((JavascriptExecutor)driver)
	.executeScript("return arguments[0].shadowRoot", element);
		return ele;
	}
	

}
