package seleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Naga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("jothi");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("CreateLead");
		driver.findElement(By.name("submitButton")).click();
		String title= driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
