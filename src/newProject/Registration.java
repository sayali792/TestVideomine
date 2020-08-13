package newProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException  {
		
 System.setProperty("webdriver.chrome.driver","/Users/floratechno/Downloads/selenium-java-3/chromedriver");
  WebDriver driver = new ChromeDriver();
  driver.get("https://stable.videomine.io");
  
  driver.findElement(By.className("js-create-account-label")).click();
  driver.findElement(By.className("js-first-name")).sendKeys("Luna");
  driver.findElement(By.className("js-checkbox-wrapper")).click();
  Thread.sleep(1000);
  driver.findElement(By.className("js-screen-1-next")).click();
  Thread.sleep(2000);
  


  driver.findElement(By.className("js-last-name")).sendKeys("Ray");
  Thread.sleep(2000);
  driver.findElement(By.className("js-screen-1-next")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.className("js-middle-name")).sendKeys("Raye");
  Thread.sleep(2000);
  driver.findElement(By.className("js-screen-1-next")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.className("js-suffix")).sendKeys("Shewale");
  Thread.sleep(2000);
  driver.findElement(By.className("js-screen-1-next")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.className("js-userId")).sendKeys("shewalesayali792@gmail.com");
  Thread.sleep(2000);
  driver.findElement(By.className("js-screen-1-next")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.className("js-signup-password")).sendKeys("MyAim@life1");
  Thread.sleep(2000);
  driver.findElement(By.className("js-screen-1-next")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.className("js-confirm-password")).sendKeys("MyAim@life1");
  Thread.sleep(2000);
  driver.findElement(By.className("js-screen-1-next")).click();
  Thread.sleep(2000);
  
//  Thread.sleep(8000);
//  
//  driver.close();


}
}
