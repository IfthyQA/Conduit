package conduit;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

@SuppressWarnings("unused")

public class realworld {
public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(180));
		
		/* Sign-up to the Application */ 
		 driver.get("https://demo.realworld.io/#/");
		 driver.findElement(By.linkText("Sign up")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Achiever6");
		 driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john.tescras0101+7@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rockon123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		/* Sign-out from the Application */ 
		 driver.findElement(By.linkText("Settings")).click();
		 driver.findElement(By.xpath("//button[contains(.,'Or click here to logout.')]")).click();		 
		 
		 /* Sign-in to the Application */ 	
		 driver.findElement(By.linkText("Sign in")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john.tescras0101+1@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Rockon123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 /* Create New Article */ 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("New Article")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("New Article")));	
		 driver.findElement(By.linkText("New Article")).click();

		 driver.findElement(By.xpath("//input[@placeholder='Article Title']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Article Title']")).sendKeys("The life and times of Mahendra Singh Dhoni");

		 driver.findElement(By.xpath("//input[@placeholder=\"What's this article about?\"]")).click();
		 driver.findElement(By.xpath("//input[@placeholder=\"What's this article about?\"]")).sendKeys("The Real Sportman ship");

		 driver.findElement(By.xpath("//textarea[@placeholder='Write your article (in markdown)']")).click();
		 driver.findElement(By.xpath("//textarea[@placeholder='Write your article (in markdown)']")).sendKeys("The 39-year-old’s last outing in India colours was during the lost World Cup semifinal against New Zealand. Mahendra Singh Dhoni, a man of few words but massive sixes, announced his retirement from international cricket in his inimitable, understated style.\r\n"
		 		+ "\r\n"
		 		+ "“Thanks. Thanks a lot for ur love and support throughout. From 19.29 hrs consider me as Retired.” This was the statement on August 15 evening on his official Instagram handle — mahi7781 — from the former India captain, who led India to the 2011 World Cup title.\r\n"
		 		+ "\r\n"
		 		+ "Dhoni poses with the World Cup trophy 2011. Batting great Sachin Tendulkar had broken a plethora of records but the elusive World Cup win only came at the fag end of his career, and under Dhoni’s leadership.");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys("Dhoni");
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys("Mr.cool");
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys("Thala");
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys("Captian");
		 driver.findElement(By.xpath("//input[@placeholder='Enter tags']")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//button[@type='button']")).click();

		 driver.findElement(By.linkText("Settings")).click();
		 
		 /* Navigate to any Article */
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));	 
		 driver.findElement(By.linkText("Home")).click();
		 driver.findElement(By.linkText("Global Feed")).click();
		 
		 /* Comment on any Article */
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/article-list[1]/article-preview[3]/div[1]/a[1]/h1[1]")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/article-list[1]/article-preview[3]/div[1]/a[1]/h1[1]")));
		 driver.findElement(By.xpath("//div[1]/article-list[1]/article-preview[3]/div[1]/a[1]/h1[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//textarea[@placeholder='Write a comment...']")).click();
		 driver.findElement(By.xpath("//textarea[@placeholder='Write a comment...']")).sendKeys("Superb, What an Article!!");
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,250)");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 /* Favorite any Article */		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/article-actions/article-meta/div/ng-transclude/span[2]/favorite-btn/button")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/article-actions/article-meta/div/ng-transclude/span[2]/favorite-btn/button")));	 	 	 
		 driver.findElement(By.xpath("//div[1]/article-actions/article-meta/div/ng-transclude/span[2]/favorite-btn/button")).click();
		 
		 /* Navigate to Global Feed */
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));	 	 	  
		 driver.findElement(By.linkText("Home")).click();
		 driver.findElement(By.linkText("Global Feed")).click();Thread.sleep(2000);
		 
		 /* Article based on TAGS */
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/a[2]")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/a[2]")));	 	 	  
		 driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/a[2]")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/article-list[1]/article-preview[1]/div[1]/a[1]/h1[1]")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/article-list[1]/article-preview[1]/div[1]/a[1]/h1[1]")));	 	 	  
		 driver.findElement(By.xpath("//div[1]/article-list[1]/article-preview[1]/div[1]/a[1]/h1[1]")).click();
		 
		 /* Write comment and Favorite on Article - search based on TAGS */
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Write a comment...']")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@placeholder='Write a comment...']")));	 	 	  
		 driver.findElement(By.xpath("//textarea[@placeholder='Write a comment...']")).click();
		 driver.findElement(By.xpath("//textarea[@placeholder='Write a comment...']")).sendKeys("Execellent, Must read Article!!");

		 JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,250)");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//div[1]/article-actions/article-meta/div/ng-transclude/span[2]/favorite-btn/button")).click();
		 
		 /* Follow Author */
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/article-actions[1]/article-meta[1]/div[1]/ng-transclude/span[2]/follow-btn/button")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/article-actions[1]/article-meta[1]/div[1]/ng-transclude/span[2]/follow-btn/button")));	 	 	  		 
		 driver.findElement(By.xpath("//div[1]/article-actions[1]/article-meta[1]/div[1]/ng-transclude/span[2]/follow-btn/button")).click();
		 
		 /* Navigate to Home */
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));	 	 	  
		 driver.findElement(By.linkText("Home")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Achiever")));
		 driver.findElement(By.linkText("Achiever")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/article-list[1]/article-preview/div[1]/a[1]/h1[1]")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/article-list[1]/article-preview/div[1]/a[1]/h1[1]")));	 	 
		 driver.findElement(By.xpath("//div/article-list[1]/article-preview/div[1]/a[1]/h1[1]")).click();
		 
		 /* Editing Article - My Article */
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/article-actions[1]/article-meta[1]/div[1]/ng-transclude/span[1]/a[1]")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/article-actions[1]/article-meta[1]/div[1]/ng-transclude/span[1]/a[1]")));	
		 driver.findElement(By.xpath("//div[1]/article-actions[1]/article-meta[1]/div[1]/ng-transclude/span[1]/a[1]")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Article Title']")));	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Article Title']")));	 	 	  
		 driver.findElement(By.xpath("//input[@placeholder='Article Title']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Article Title']")).clear();
		 driver.findElement(By.xpath("//input[@placeholder='Article Title']")).sendKeys("The life and times of Mahendra Singh Dhoni - Edited");
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 /* Sign-out from the Application */ 
		 driver.findElement(By.linkText("Settings")).click();
		 driver.findElement(By.xpath("//button[contains(.,'Or click here to logout.')]")).click();
		 driver.close();
		 }

}