package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registation {

	
	WebDriver driver=null;
	String dp,fname,lname,phno,uname,mail,pwd,cpwd,des;
	
	@Given("^The user on Demoqa website$")
	public void the_user_on_Demoqa_website()
	{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Project6\\src\\test\\resources\\lib\\chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.get("http://demoqa.com/registration/");
		   
		
			
	}
	

@When("^The user pass data to textboxes \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void the_user_pass_data_to_textboxes(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) 

{           driver.findElement(By.name("first_name")).sendKeys(arg1);
		        driver.findElement(By.name("last_name")).sendKeys(arg2);
		    
		    driver.findElement(By.id("phone_9")).sendKeys(arg3);
		   
		    driver.findElement(By.id("username")).sendKeys(arg4);
		   
	        driver.findElement(By.name("e_mail")).sendKeys(arg5);
	        
	        driver.findElement(By.id("description")).sendKeys(arg6);
		    
		    driver.findElement(By.name("password")).sendKeys(arg7);
		   
		    driver.findElement(By.id("confirm_password_password_2")).sendKeys(arg8);
		    
	        
	       
	}

@Then("^The user verify that data \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" in textbox or not$")
public void the_user_verify_that_data_in_textbox_or_not(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) 
{
	Assert.assertEquals("nagamani",arg1);
    Assert.assertEquals("nagamani",arg2);
    Assert.assertEquals("9876543298",arg3);
    Assert.assertEquals("nagamani",arg4);
    Assert.assertEquals("mani@gmail.com",arg5);
    Assert.assertEquals("nagamani",arg6);
    Assert.assertEquals("nagamani",arg7);
    Assert.assertEquals("nagamani",arg8);
    driver.close();
    
    

	
	
}

    @When("^The user select checkbox$")
	public void the_user_select_checkbox() 
	{
		driver.findElement(By.xpath("(//input[@value='dance'])")).click();
		driver.findElement(By.xpath("//input[@value='reading']")).click();
		driver.findElement(By.xpath("//input[@value='cricket ']")).click();

		
	}

	@Then("^The user verify checkbox is select or not$")
	public void the_user_verify_checkbox_is_select_or_not() 
	{
    boolean dance=driver.findElement(By.xpath("(//input[@value='dance'])")).isSelected();
	boolean reading=driver.findElement(By.xpath("//input[@value='reading']")).isSelected();
	boolean cricket=driver.findElement(By.xpath("//input[@value='cricket ']")).isSelected();
	Assert.assertTrue(cricket && dance && reading);
	driver.close();

		
	}

	@When("^The user select radio buttion$")
	public void the_user_select_radio_buttion() 
	{
		driver.findElement(By.xpath("//input[@value='single']")).click();
		//driver.findElement(By.xpath("//input[@value='married']")).click();
		//driver.findElement(By.xpath("//input[@value='divorced']")).click();
		
	}

	@Then("^The user verify radio button select or not$")
	public void the_user_verify_radio_button_select_or_not() 
	{
		boolean select=driver.findElement(By.xpath("//input[@value='single']")).isSelected();
		Assert.assertTrue(select);
		//boolean select1=driver.findElement(By.xpath("//input[@value='married']")).isSelected();
		//Assert.assertTrue(select1);
		//boolean select2=driver.findElement(By.xpath("//input[@value='divorced']")).isSelected();
		//Assert.assertTrue(select2);
		driver.close();
	    
	}

	@When("^The user select dropdown$")
	public void the_user_select_dropdown() 
	{
		WebElement sel=driver.findElement(By.id("dropdown_7"));
		Select s=new Select(sel);
		s.selectByVisibleText("India");
	
		dp=s.getFirstSelectedOption().getText();
	  
	}

	@Then("^The user verify dropdown is select or not$")
	public void the_user_verify_dropdown_is_select_or_not() 
	{
		
				Assert.assertEquals("India", dp);
				driver.close();

	}

}
