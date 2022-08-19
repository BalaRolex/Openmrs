package Pagemodels;




import org.openqa.selenium.WebDriver;

import Datahandlers.Datahandle;
import Pages.Loginpage;

public class Login extends Datahandle{
	WebDriver driver;
	Loginpage lp;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		lp=new Loginpage(driver);
		
	}
	   
	public void LoginUsername(String username)
	{
		SendInput(lp.Username(),username);
	}
	public void LoginPassword(String password)
	{
		SendInput(lp.Password(),password);
	}
	public void LoginLocation()
	{
		for(int i=0;i<lp.Location().size();i++)
		{
			if(lp.Location().get(i).getText().equalsIgnoreCase("Inpatient Ward"))
			{
				lp.Location().get(i).click();
			}
		}
	}
	public void LoginButton()
	{
		click(lp.Login());
	}

	
	
	
	

	
	
	

}
