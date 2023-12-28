import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
	WebDriver driver;
	@Test
	public void testCase1() {
		
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
	}
	@Test
	public void testCase2()
	{
		String actual_title=driver.getTitle();
		String exptected_title="Facebook – log in or sign up";
		
		if(actual_title.equals(exptected_title))
		{
			System.out.println("Test Case 2 is passed!");
		}
		else
		{
			System.out.println("Test Case 2 is failed!");
		}
	}
	@Test
	public void testCase3()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
	}
}
