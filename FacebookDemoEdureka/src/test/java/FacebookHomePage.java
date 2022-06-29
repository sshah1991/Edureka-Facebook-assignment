import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","/Users/admin/Desktop/SelfStudy/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//driver.close();
		
		//find the button
		
		String expectedColour="rgba(24, 119, 242, 1)";
		WebElement element= driver.findElement(By.name("login"));
		
		
		String actualcolour=element.getCssValue("background-color");
		System.out.println(actualcolour);
		
		if(expectedColour.equals(actualcolour)) {
			System.out.println("Colour Test Pass");
		}else {
			System.out.println("Colour Test Fail");
		}
		
		//Click on Forgot me
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		
		
		
		

	}
		
}
