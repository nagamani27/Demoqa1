package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registation {

	
	WebDriver driver=null;
	String TxtA1,TxtA2,TxtA3,TxtA4,TxtA5,TxtA6,TxtA7,TxtA8,Dpd1,Dpd2,Dpd3,Dpd4;
	
	@Given("^The user on Demoqa website$")
	public void the_user_on_Demoqa_website()  
	{       
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Project\\src\\test\\resources\\lib\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	
     }
	
@When("^The user pass data to textboxes \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void the_user_pass_data_to_textboxes(String Fname, String Lname, String phnum, String usname, String mailid, String desc, String password, String cpassword) 
		 
{           driver.findElement(By.name("first_name")).sendKeys(Fname);
            TxtA1=driver.findElement(By.name("first_name")).getAttribute("value");
		    driver.findElement(By.name("last_name")).sendKeys(Lname);
		    TxtA2= driver.findElement(By.name("last_name")).getAttribute("value");
		    driver.findElement(By.id("phone_9")).sendKeys(phnum);
		    TxtA3=driver.findElement(By.id("phone_9")).getAttribute("value");
		    driver.findElement(By.id("username")).sendKeys(usname);
		    TxtA4=driver.findElement(By.id("username")).getAttribute("value");
	        driver.findElement(By.name("e_mail")).sendKeys(mailid);
	        TxtA5=driver.findElement(By.name("e_mail")).getAttribute("value");
	        driver.findElement(By.id("description")).sendKeys(desc);
	        TxtA6=driver.findElement(By.id("description")).getAttribute("value");
		    driver.findElement(By.name("password")).sendKeys(password);
		    TxtA7=driver.findElement(By.name("password")).getAttribute("value");
		    driver.findElement(By.id("confirm_password_password_2")).sendKeys(cpassword);
		    TxtA8=driver.findElement(By.id("confirm_password_password_2")).getAttribute("value");
		 
	       
	}

@Then("^The user verify that data \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\" in textbox or not$")
public void the_user_verify_that_data_in_textbox_or_not(String name1, String name2, String Phnum, String Uname, String Mail, String Des, String Pwd, String Cpwd) 
		 
{
	
	Assert.assertEquals(name1,TxtA1);
    Assert.assertEquals(name2,TxtA2);
    Assert.assertEquals(Phnum,TxtA3);
    Assert.assertEquals(Uname,TxtA4);
    Assert.assertEquals(Mail,TxtA5);
    Assert.assertEquals(Des,TxtA6);
    Assert.assertEquals(Pwd,TxtA7);
    Assert.assertEquals(Cpwd,TxtA8);
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
		WebElement Dd=driver.findElement(By.id("dropdown_7"));
		Select s=new Select(Dd);
		s.selectByVisibleText("India");
        Dpd1=s.getFirstSelectedOption().getText();
        WebElement Dd1=driver.findElement(By.id("mm_date_8"));
		Select s1=new Select(Dd1);
		s.selectByVisibleText("4");
		Dpd2=s.getFirstSelectedOption().getText();
		WebElement Dd2=driver.findElement(By.id("dd_date_8"));
		Select s2=new Select(Dd2);
		s.selectByVisibleText("27");
		Dpd3=s.getFirstSelectedOption().getText();
		WebElement Dd3=driver.findElement(By.id("yy_date_8"));
		Select s3=new Select(Dd3);
		s.selectByVisibleText("1991");
		Dpd4=s.getFirstSelectedOption().getText();
        
	
	  
	}

	@Then("^The user verify dropdown is select or not$")
	public void the_user_verify_dropdown_is_select_or_not()
			 
	{
		
				Assert.assertEquals("India",Dpd1);
				Assert.assertEquals("4",Dpd2);
				Assert.assertEquals("27",Dpd3);
				Assert.assertEquals("1991",Dpd4);
				driver.close();
				 
	}

}
