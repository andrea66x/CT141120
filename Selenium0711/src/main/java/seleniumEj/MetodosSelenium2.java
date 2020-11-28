package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MetodosSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;	// Traer el path del proyecto y el separator es el '/' y con esto seteamos el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); 	// Identificando el ejecutable para el driver
		WebDriver driver = new ChromeDriver();	// Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("https://opensource-demo.orangehrmlive.com/");	// Abriendo el Chrome con la URL especificada
		driver.manage().window().maximize();	// Maximiza la Ventana
		
		/* Obteniendo objetos o web elements de la pagina web */
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		/* Realizando el Login */
		userName.sendKeys("Admin");
		Thread.sleep(2000);    
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(5000);
		
		// Click en boton Assign Leave
		WebElement assignLeave = driver.findElement(By.className("quickLinkText"));
		assignLeave.click();
		Thread.sleep(3000);
		
		WebElement employeeName = driver.findElement(By.name("assignleave[txtEmployee][empName]"));
		employeeName.sendKeys("Andrea Torres");
		Thread.sleep(3000);
		// employeeName.clear();
		
		// Verificar elemento desplegado en pagina
		boolean assignBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
		
		if(assignBtn) {
			System.out.println("El boton assign esta desplegado");
		}
		
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		boolean userMsj = welcomeMsj.contains("Paul");
		if(userMsj) {
			System.out.println("El mensaje de welcome contiene el nombre de Paul");
		} else {
			System.out.println("El mensaje No contiene el nombre de Paul");
		}
		
		// Interactuar con dropdown
		Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		oSelect.selectByVisibleText("US - FMLA");
		Thread.sleep(3000);
		
		// Cerrar el navegador web
		driver.quit();
	}

}
