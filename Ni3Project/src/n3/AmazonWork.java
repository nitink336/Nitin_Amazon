package n3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonWork {

	
	public static void main(String[] args) {
		AmazonWork Method = new AmazonWork();
		Method.Created();
	}

	public void Created() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp-hp\\Desktop\\Nitin Data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[1]/li[8]/a")).click();
			
		driver.findElement(By.xpath("//*[@id='hmenu-content']/ul[3]/li[3]/a")).click();
		
		System.out.println("All-new Fire TV Stick Lite with Alexa Voice Remote Lite, Validation successfully done");
		boolean Tital = driver.findElement(By.xpath("//*[@id='productTitle']")).isDisplayed();
		System.out.println(Tital);
		
		System.out.println("Rating Validation successfully done");
		boolean Rating = driver.findElement(By.xpath("//*[@id='acrCustomerReviewText']")).isDisplayed();
		System.out.println(Rating);
		
		
		System.out.println("Image for All-new Fire TV Stick Lite with Alexa Voice Remote Lite, Validation successfully done");
		boolean Image = driver.findElement(By.xpath("(//*[@id='a-autoid-8']/span/input)[2]")).isDisplayed();
		System.out.println(Image);
		
	
		driver.close();
	}

}
