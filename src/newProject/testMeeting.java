package newProject;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;


public class testMeeting {
	WebDriver driver;
	
//	public static void main(String[] args) throws InterruptedException {
//		testMeeting obj = new testMeeting();	
//	obj.start();
//
//		  
//	}
@Test
	public void start () throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","/Users/floratechno/Downloads/selenium-java-3/chromedriver");
				
		  //this will merge the capabilities to the ChromeOptions
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("demo_capability", true);

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--allow-file-access-from-files",
	            "--use-fake-ui-for-media-stream",
	            "--allow-file-access",
//	            "--use-file-for-fake-audio-capture=D:\\PATH\\TO\\WAV\\xxx.wav",
	            "--use-fake-device-for-media-stream",
	            "-enable-logging=stderr", 
	            "--no-first-run", 
	            "--vmodule=\"*media/*=3,*turn*=3",
	            "--mute-audio"
//	            "--headless",
//	            "--window-size=1200x600"
	            );
	
		
		options.merge(capabilities);
		
		
		driver = new ChromeDriver(options);
		 driver.get("https://nightly.videomine.io/chat/testing");
//		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND +"t"); 
		 
		 
		 for(int i = 0;i < 7; i++) {

		 ((JavascriptExecutor) driver).executeScript("window.open('https://nightly.videomine.io/chat/testing','_blank');");
		 
		  
		 }
		 
		 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 
		 
		 for(int i = 0;i <= 7; i++) {

			 driver.switchTo().window(tabs.get(i));
			 WebElement videoChatM = driver.findElement(By.tagName("vm-video-chat-manager"));
			  WebElement videoChatMShadow = expandRootElement(videoChatM, driver);
			  WebElement videoChat = videoChatMShadow.findElement(By.tagName("vm-video-chat"));
			  WebElement videoChatShadow = expandRootElement(videoChat, driver);
			  WebElement videoChatMike = videoChatShadow.findElement(By.tagName("mic-camera-option-ui"));
			  WebElement videoChatMikeShadow = expandRootElement(videoChatMike, driver);
			  Thread.sleep(1000);
			  videoChatMikeShadow.findElement(By.className("js-continue")).click();
			  Thread.sleep(1000);
			  
			 }
		 
//		  driver.get("https://nightly.videomine.io/chat/testing");

		 
		
//		for(int i=0;i<5;i++) {
//	Thread.sleep(i*1000);
//		 users(1); 
//		}  
	
	
		
		
	}

	
	public void users(int i) throws InterruptedException {
		
		
	
		  driver.get("https://nightly.videomine.io/chat/testing");
		  
		  
		  
		  WebElement videoChatM = driver.findElement(By.tagName("vm-video-chat-manager"));
		  WebElement videoChatMShadow = expandRootElement(videoChatM, driver);
		  WebElement videoChat = videoChatMShadow.findElement(By.tagName("vm-video-chat"));
		  WebElement videoChatShadow = expandRootElement(videoChat, driver);
		  WebElement videoChatMike = videoChatShadow.findElement(By.tagName("mic-camera-option-ui"));
		  WebElement videoChatMikeShadow = expandRootElement(videoChatMike, driver);
		  Thread.sleep(1000);
		  videoChatMikeShadow.findElement(By.className("js-continue")).click();
		  Thread.sleep(1000);
		  
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t"); 
			
		  driver.get("https://nightly.videomine.io/chat/testing");
		  
		  
		  
		  WebElement videoChatM1 = driver.findElement(By.tagName("vm-video-chat-manager"));
		  WebElement videoChatMShadow1 = expandRootElement(videoChatM1, driver);
		  WebElement videoChat1 = videoChatMShadow1.findElement(By.tagName("vm-video-chat"));
		  WebElement videoChatShadow1 = expandRootElement(videoChat1, driver);
		  WebElement videoChatMike1 = videoChatShadow1.findElement(By.tagName("mic-camera-option-ui"));
		  WebElement videoChatMikeShadow1 = expandRootElement(videoChatMike1, driver);
		  Thread.sleep(1000);
		  videoChatMikeShadow1.findElement(By.className("js-continue")).click();
		  
		
	}
	
	public WebElement expandRootElement(WebElement element, WebDriver driver) {
		
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",element);
		return ele;
	}
}
