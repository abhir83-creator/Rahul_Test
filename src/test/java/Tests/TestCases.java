package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCases {
	
	@Test
	public void Tc01() {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		
	}
	
	@Test
	public void Tc02() {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://facebook.com");
		
	}

}
