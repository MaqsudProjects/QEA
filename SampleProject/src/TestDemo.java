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

}
