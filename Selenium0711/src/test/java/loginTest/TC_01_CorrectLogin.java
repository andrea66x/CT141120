package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.driverSetup;
import globalVariables.GlobalVariables;
import navigationPages.LoginPage;

public class TC_01_CorrectLogin {
	// Declarar e inicializar un objeto del tipo WebDriver para usarlo en nuestra Test Class
	WebDriver driver = driverSetup.setupDriver();
	
	// Login PageObject
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		driver.manage().window().maximize();
	}
			
    @Test
    public void TC_01() {
    	login.login(GlobalVariables.USER_ADMIN, GlobalVariables.PASSWORD_ADMIN);
    }
    
    @AfterTest
    public void closeDriver() {
    	driver.quit();
    }
}
