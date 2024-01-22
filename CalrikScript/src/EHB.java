import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class EHB 
{
public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver 120\\chromedriver-win64\\chromedriver120.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://staginghandbookbuilder2.blr.com/adminpanel/login.aspx");
		System.out.print(driver.getWindowHandle());
		driver.findElement(By.xpath("//input[@id='Content1_txtUserName']")).sendKeys("adminace");
		driver.findElement(By.xpath("//input[@id='Content1_txtPassword']")).sendKeys("adminace");
		driver.findElement(By.xpath("//input[@id='Content1_btnLogin']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='PEO User']")).click();
		driver.findElement(By.xpath("//input[@id='Content1_txtCompanyName']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='Content1_btnSearch']")).click();
		driver.findElement(By.xpath("//a[@id='Content1_rptPaging_lbPageNumber_1']")).click();
		
		String Parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//span[@id='Content1_rptUserList_divlogin_8']//a[contains(text(),'Login')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
	    for(String child : allWindows)
		{
			if(!Parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				
			}
		}
	    driver.findElement(By.xpath("//a[@id='Content1_hrefSetup']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserCreateForm_cbAll']")).click();
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserCreateForm_btnCheckout']")).click();
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtFirstName']")).sendKeys("Vivek");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtLastName']")).sendKeys("R");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtTitle']")).sendKeys("QA");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtCompany']")).sendKeys("Flipkart");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtAddressLine1']")).sendKeys("C Scheme, Opposite Mall");
	    
	    Select dropState = new Select(driver.findElement(By.xpath("//select[@id='Content1_divSubUserRegistration_ddlState']")));
	    dropState.selectByVisibleText("Texas");
	    
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtCity']")).sendKeys("Austin");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtZipcode']")).sendKeys("73301");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtEmail']")).sendKeys("dummy@mailinator.com");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtReEmail']")).sendKeys("dummy@mailinator.com");
	    //UserID needs to be update in each execution
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtUserId']")).sendKeys("dummy29");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtpassword']")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_txtConfirmPassword']")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//input[@id='Content1_divSubUserRegistration_btnpurchase']")).click();
	    String Parent2 = driver.getWindowHandle();
	    driver.findElement(By.xpath("//a[@class='button-blue']")).click();
	    
	    Set<String> allWindowss = driver.getWindowHandles();
	    for(String childd : allWindowss)
		{
			if(!Parent2.equalsIgnoreCase(childd))
			{
				driver.switchTo().window(childd);
				
			}
		}
	    driver.findElement(By.xpath("//a[@id='Content1_btnhandbook']")).click();
	    // Questionnaire
	    Select font = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_0']")));
	    font.selectByVisibleText("Arial");
	    
	    Select fontsize = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_1']")));
	    fontsize.selectByVisibleText("Standard");
	    
	    Select alignment = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_2']")));
	    alignment.selectByVisibleText("Justify");
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
	    Select titlefont = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_0']")));
	    titlefont.selectByVisibleText("Calibri");
	    
	    Select titlefontsize = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_1']")));
	    titlefontsize.selectByVisibleText("Larger");
	    
	    Select letterCase = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_4']")));
	    letterCase.selectByVisibleText("Default - As in the system");
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
	    Select policyFont = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_0']")));
	    policyFont.selectByVisibleText("Futura");
	    
	    Select policySize = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_1']")));
	    policySize.selectByVisibleText("Smaller");
	    
	    Select policyCase = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_4']")));
	    policyCase.selectByVisibleText("As I changed/entered");
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='Content1_MainRepeater_txtCustom_0']")).sendKeys("Wipro");
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//label[text()='Yes']")).click();
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    driver.findElement(By.xpath("//label[text()='Company Name']")).click();
	    driver.findElement(By.xpath("//label[text()='Company Logo']")).click();
	    driver.findElement(By.xpath("//label[text()='Last Updated Date']")).click();
	    driver.findElement(By.xpath("//label[text()='State Name']")).click();
	    driver.findElement(By.xpath("//label[text()='State Flag']")).click();
	    driver.findElement(By.xpath("//label[text()='Acknowledgment Forms - PDF View']")).click();
	    driver.findElement(By.xpath("//label[text()='Acknowledgment Forms - HTML View']")).click();
	    driver.findElement(By.xpath("//label[text()='Yes']")).click();
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    driver.findElement(By.xpath("//input[@id='Content1_MainRepeater_txtusername_0']")).sendKeys("TestUser");
	    driver.findElement(By.xpath("//input[@id='Content1_MainRepeater_txtPassword_0']")).sendKeys("Test@123");
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
	    driver.findElement(By.xpath("//label[@for='Content1_MainRepeater_rdbList_0_0_0']")).click();
	    driver.findElement(By.xpath("//label[@for='Content1_MainRepeater_rdbList_2_1_2']")).click();
	    Select dateFormat = new Select(driver.findElement(By.xpath("//select[@id='Content1_MainRepeater_ddlcustom_3']")));
	    dateFormat.selectByVisibleText("Month Name, Date, Year");
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
	    //handbook setup-header
	    driver.findElement(By.xpath("//label[text()='No']")).click();
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
	    //handbook setup-footer
	    driver.findElement(By.xpath("//label[text()='No']")).click();
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
	    //Thread.sleep(20000); //handbook setup-watermark
	    driver.findElement(By.xpath("//label[text()='No']")).click();
	    driver.findElement(By.xpath("//img[@title='Save']")).click();
	    
//	    driver.findElement(By.xpath("//label[text()='Manual']")).click();
//	    driver.findElement(By.xpath("//img[@title='Save']")).click();
//	    
//	    Thread.sleep(5000);
//	    List <WebElement> textFields = driver.findElements(By.xpath("//input[@type='text']"));
//	    System.out.print(textFields.size());
//	    for(int i=0;i<textFields.size();i++)
//	    {
//	    	textFields.get(i).sendKeys("100");
//	    }
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
