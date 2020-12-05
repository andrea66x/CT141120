package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// DashboardObjects
	@FindBy(id="welcome")
	private WebElement welcomeDrpDwn;
	
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	private WebElement logoutBtn;
	
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		welcomeDrpDwn.click();
		Thread.sleep(1000);
		logoutBtn.click();
	}
}
