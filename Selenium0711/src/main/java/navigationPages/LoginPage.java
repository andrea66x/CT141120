package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,  this);	// Inicializamos los webElement con PageFactory. 'This' es un keyword con el que estamos indicando que es la misma clase donde se inicializan los objetos.
	}
	
	// Login PageObjects/WebElements
	@FindBy(id="txtUsername")
	private WebElement userNameTxt;
	
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	@FindBy(id="//*[@id=\"spanMessage\"]")
	private WebElement errorMessage;
	
	public void login(String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean incorrectLogin(String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		boolean msj = errorMessage.getText().contains("Invalid credentials");
		
		return msj;
	}
}
