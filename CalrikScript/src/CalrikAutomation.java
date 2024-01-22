import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalrikAutomation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\vivek\\Downloads\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.calrik.com/login");

	}

}
