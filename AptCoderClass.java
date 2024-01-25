package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AptCoderClass {
   
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\offic\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  
	  ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 //WebDriver driver = new ChromeDriver(options);
		 this.driver = new ChromeDriver(options);
	  driver.manage().window().maximize(); // maximize the window
	  driver.manage().deleteAllCookies(); //means delete all cookies and catche
		 //dynamic wait
	  //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//load the page dynamically
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // load the elements dynamically
	  driver.get("https://kcc.aptcoder.in/");
}
	
	
	// 1 -Home Page Click Home Page And inside open extra home page and open Get a Free Class
	
	
	@Test
	public void HomeClass() throws InterruptedException{
		//Click Home Page And inside open extra home page and open Get a Free Class
         driver.findElement(By.xpath("//span[contains(text(),'Get a Free Class')]")).click();
         //driver.findElement(By.xpath("//*[@id=\"menu-item-1299\"]/a")).click();
         driver.findElement(By.xpath("//button[@type='button' and @class='btn section1-button-1']")).click();
         
         Thread.sleep(3000);
	}
	
	
	
	
	  //2- Inside Home Page Unlock Access Pontential
	@Test
	public  void AccessPotential() throws InterruptedException{
	
	//Inside Home (aptcoder Unlock Access Potential button 
    driver.findElement(By.xpath("//i[@class='fas fa-play-circle']")).click();
    //Thread.sleep(3000);
	
	}
	
	
	
	
	// 3- Practice Coding
	@Test
	public void PracticeCoding() throws InterruptedException {
	   
		 //Practice Coding
		driver.findElement(By.xpath("//*[@id='menu-item-1607']/a")).click();
		
		// Class1 -> Editor and Compiler page 
        driver.findElement(By.xpath("//a[@class='bb_card_link_button' or @href='https://kcc.aptcoder.in/practice-programming-problems/']")).click();
     
        // Class-2 -> Editor and compiler page
      driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button' or @href='https://kcc.aptcoder.in/practice-programming-problems-2/']")).click();
        // Class-3 -> Page is not loading 
      driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button_broken_link' or @href='http://examplesite.local/practice-programming-problems-3/']")).click();
        // Class-4 ->
      driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button_broken_link' or  @href='http://examplesite.local/practice-programming-problems-4/']")).click();
        
     //Thread.sleep(10000);
      //  Class 5 to 12 Page is not loading	
		
	}
	
	
	
	
	
	//4 - 30 Days Of Coding
	@Test
	public void DaysCoding() throws InterruptedException {
		// 30 days of code page opening
         driver.findElement(By.xpath("//*[@id=\"menu-item-2557\"]/a")).click();
         
         //Open HTML Documentation Page
         driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button' and  @href='https://kcc.aptcoder.in/2497-2-copy-3/']")).click();
         
          
         // Inside open 25 days of calender page  
         //driver.findElement(By.xpath("//img[@class='f1-photo-img wp-image-2537 size-full' or @src='http://15.207.31.37/wp-content/uploads/2022/10/Day_25.png']")).click();
   
         // Open Python Documentation Page 
         
         driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button' and @ href='https://kcc.aptcoder.in/2497-2-copy-2/']")).click();     
         Thread.sleep(6000);
	}

	
	
	 //5 -Inside Home navbaar About Page
	@Test
	 public void AboutPage() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[contains(text(),'Get a Free Class')]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/ul/li[2]/a")).click();
		//Thread.sleep(3000);
		 
	 }
	 
	 
	 
	
	
	
	//6 - Tutorials
	@Test
	public void Tutorials() throws InterruptedException {
		//Open Singal Home Page  Tutorials Page
         driver.findElement(By.xpath("//*[@id=\"menu-item-2626\"]/a")).click();
    
         //Open HTML Documentation Page
         driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button' and @href='https://kcc.aptcoder.in/tuthtml/']")).click();
         
         //Python Documentation 
         driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button' and @href='https://kcc.aptcoder.in/python-documentation/']")).click();
         
         //Java Script Documentation
         driver.findElement(By.xpath("//a[@class='bb_boot_card_link_button' and @href='https://kcc.aptcoder.in/javascript-documentation/']")).click();
      
       // Inside Home page click and open one extra home page navi bar and dropdown Summer Code Camp
         //Thread.sleep(3000);
	}
	
	
	

	    //7- Courses 
	@Test
	public void InsideExtraHomePage() throws InterruptedException {
	     
		 driver.findElement(By.xpath("//span[contains(text(),'Get a Free Class')]")).click();
		// Inside Home page click and open one extra home page navi bar and dropdown Summer Code Camp
         driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
        // Thread.sleep(3000);
	}
	
	
	

	//8 -Contact US - Comments Section
	@Test
	public void ContactUs() throws InterruptedException {
		
		  // Open Inside Home Page open one extra home navibaar open Contact US Page
        // Inside Contact Us Page and Comments Section
		 driver.findElement(By.xpath("//span[contains(text(),'Get a Free Class')]")).click();
         driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
         driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hi,I am Farhan");
         driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Farhan");
         driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8282828282");
        driver.findElement(By.xpath("//input[@type='email' and @id='email']")).sendKeys("test@gmail.com");
        //Thread.sleep(3000);
	}
	
	
	
	  @AfterMethod
      public void tearDown() {
    	  driver.quit();
      
      }

}