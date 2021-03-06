package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEj {

	public static void main(String[] args) throws InterruptedException {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;	// Traer el path del proyecto y el separator es el '/' y con esto seteamos el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); 	// Identificando el ejecutable para el driver
		WebDriver driver = new ChromeDriver();	// Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("https://opensource-demo.orangehrmlive.com/");	// Abriendo el Chrome con la URL especificada
		driver.manage().window().maximize();	// Maximiza la Ventana
		
		/* Obteniendo objetos o web elements de la pagina web */
		// WebElement userName = driver.findElement(By.xpath("//*[@id=\"assignleave_txtEmployee_empId\"]"); // Usando XPath
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
		
		List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
		System.out.println("Numero de elementos " + firstLevelMenu.size()); // Metodo de Java para ver el numero de elementos en la lista
		String primerMenu = firstLevelMenu.get(0).getText();
		System.out.println(primerMenu);
		String segundoMenu = firstLevelMenu.get(1).getText();
		System.out.println(segundoMenu);
		
		for(int i=0; i<firstLevelMenu.size(); i++) {
			System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
		}
	}

}
