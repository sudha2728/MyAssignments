package selenium.proj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title 
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click(); //to select account tab
		driver.findElement(By.linkText("Create Account")).click(); //to select create account
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation tester");
		//to select industryID from drop down box
		WebElement indusryID = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(indusryID);
		sec.selectByIndex(3);
		//to select owershipID from drop down box select by visible text
		WebElement ownerID = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(ownerID);
		sec1.selectByVisibleText("S-Corporation");
		//to select employee as the source by select by value
		WebElement employ = driver.findElement(By.id("dataSourceId"));
		Select sec2 = new Select(employ);
		sec2.selectByValue("LEAD_EMPLOYEE");
		//to select ecommerce as the marketing campign using select by index
		WebElement campignID = driver.findElement(By.id("marketingCampaignId"));
		Select sec3 = new Select(campignID);
		sec3.selectByIndex(6);
		//to select texas as state using select by value
		WebElement stateID = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec4 = new Select(stateID);
		sec4.selectByValue("TX");
		//select create account
		driver.findElement(By.className("smallSubmit")).click();
		//to close browser
		driver.close();	
	}
	
}
