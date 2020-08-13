package newProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class helloWorld {

	public static void main(String[] args) throws InterruptedException  {
				
		 System.setProperty("webdriver.chrome.driver","/Users/floratechno/Downloads/selenium-java-3/chromedriver");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://stable.videomine.io");
	      
//	      driver.findElement(By.className("js-email-id")).sendKeys("shewalesayali792@gmail.com");
//	      Thread.sleep(3000);
//	      driver.findElement(By.className("js-sign-in")).click();
//	      Thread.sleep(3000);
//	      
//	            
//	      driver.findElement(By.className("js-email-id")).clear();
//	      Thread.sleep(1000);
//	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).sendKeys("MyAim@life1");
//	      Thread.sleep(1000);
//	      driver.findElement(By.className("js-sign-in")).click();
//	      Thread.sleep(3000);
//	      
//	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).clear();
//	      driver.findElement(By.className("js-email-id")).sendKeys("shewalesayali792@gmail.com");
//	      Thread.sleep(300);
//	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).sendKeys("s");
//	      driver.findElement(By.className("js-sign-in")).click();
//	      Thread.sleep(3000);
	      
//	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).clear();
//	      driver.findElement(By.className("js-email-id")).clear();
//	      Thread.sleep(300);
//	      driver.findElement(By.className("js-email-id")).sendKeys("shewalesayali792@gmail.com");
//	      Thread.sleep(300);
//	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).sendKeys("MyAim@life1");
//	      driver.findElement(By.className("js-sign-in")).click();
//	      Thread.sleep(8000);
//	      driver.findElement(By.className("js-profile")).click();
//	      Thread.sleep(2000);
//	      driver.findElement(By.className("logout-setting-li")).click();
//	      Thread.sleep(2000); 
	      
	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).clear();
	      driver.findElement(By.className("js-email-id")).clear();
	      driver.findElement(By.className("js-forgot-password")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.className("js-reset-password-email-id")).sendKeys("shewalesayali792@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.className("js-reset-forgot-password")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("digit-1")).sendKeys("1");
	      Thread.sleep(300);
	      driver.findElement(By.id("digit-2")).sendKeys("1");
	      Thread.sleep(300);
	      driver.findElement(By.id("digit-3")).sendKeys("1");
	      Thread.sleep(300);
	      driver.findElement(By.id("digit-4")).sendKeys("1");
	      Thread.sleep(300);
	      driver.findElement(By.id("digit-5")).sendKeys("1");
	      Thread.sleep(300);
	      driver.findElement(By.id("digit-6")).sendKeys("1");
	      Thread.sleep(300);
	      driver.findElement(By.className("js-submit-reset-password")).click();
	      Thread.sleep(30000);
	      driver.findElement(By.className("js-resend-otp-wrapper")).click();
	      Thread.sleep(2000);
//	      driver.findElement(By.xpath("/html/body/section[2]/div/div/div[3]/div/div[2]/input")).clear();
//	      driver.findElement(By.className("js-fb-login")).click();
//	      Thread.sleep(8000);
	       
	      driver.close();
		
		
	}

}
