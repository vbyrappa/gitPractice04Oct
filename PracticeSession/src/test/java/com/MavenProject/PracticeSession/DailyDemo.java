package com.MavenProject.PracticeSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DailyDemo {
	
	Logger logger = LogManager.getLogger(DailyDemo.class);
	
	WebDriver driver;	

	@Test(priority = 1)
	public void test_setup() throws Exception {
		logger.info("Assign the Path of ChromeDriver");
		System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
		logger.info("Initilize the ChomreBrowser");
		driver= new ChromeDriver();	
		logger.info("Open the Browser Application");
		driver.get("https://www.edureka.co/");
		logger.info("Wait for the Browser to Open and display the Element");
		Thread.sleep(1000);
 }
		
	@Test(priority = 2)
	public void test() throws Exception {
		 logger.info("Click on the LoginIn Link");
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
		 logger.info("Wiat for the Browser to Open and Display the WebElement");
		Thread.sleep(4000);
		 logger.info("Enter the Email-ID");
		driver.findElement(By.id("si_popup_email")).sendKeys("vijay.byrappa@gmail.com");
		 logger.info("Enter the Password");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("P@ssword123");
		 logger.info("Click on the Login Button");
		driver.findElement(
				By.xpath("(//*[@id=\"new_sign_up_mode\"]//button[contains(@class,'clik_btn_log btn-block')])[3]"))
				.click();
		 logger.info("Wait for the Browser to open and display the WebElement");
		Thread.sleep(10000);
		 logger.info("Click on the Usr Image");
		//driver.findElement(By.xpath("//*[@id=\"footauto\"]//img[contains(@class,'user_image')]")).click();
		 //driver.findElement(By.xpath("//*[@id='footauto']//img[contains(@class,'user_image')]")).click();
		 driver.findElement(By.xpath("//*[@id='footauto']//span[contains(@class,'user_name')]")).click();
		 logger.info("Click on the Profile");
		driver.findElement(By.linkText("My Profile")).click();
		 logger.info("Wait for the Browser to Open and display the WebElement");
		Thread.sleep(5000);
		 logger.info("Click on the Edit link of the Personal Details");
		driver.findElement(By.cssSelector("#personal_details > i")).click();
		 logger.info("Wait for the Open Browser and Display the WebElement");
		Thread.sleep(5000);
		 logger.info("Click on the Photo Image");
		driver.findElement(By.cssSelector("#collapseOne > div > div > div.profile-photo-section > a > i")).click();
		 logger.info("Wait for the Open Browser and Display the WebElement");
		Thread.sleep(10000);
		 logger.info("Click on the Upload Image");
		driver.findElement(By.id("custom-input")).click();
		 logger.info("Wait for the Open Browser and Display the WebElement");
		Thread.sleep(10000);
	logger.info("Upload the Image into the Application");
		Runtime.getRuntime().exec("FileUploader.exe");
	 logger.info("Wait for the Open Browser and Display the WebElement");
		Thread.sleep(10000);

		driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-personal-details/div[2]/div/div/div[2]/div[2]/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn btn-default pull-right verify-continue-btn']"))
		.click();
			}
	
	@AfterTest
	public void Aftertest() throws Exception {
		logger.info("Wait for the Open Browser and Display the WebElement");
		Thread.sleep(5000);	
		logger.info("Close the Application Browser");
		driver.close();
	}
}