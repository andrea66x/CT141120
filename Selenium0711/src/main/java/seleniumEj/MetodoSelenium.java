package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodoSelenium {

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
		
		// Metodos del explorador
		String title = driver.getTitle();
		System.out.println("El titulo es: " + title);
		
		// Validacion Homepage
		String urlDashboard = driver.getCurrentUrl();
		boolean loginCorrect = urlDashboard.contains("/dashboard"); // Contains es un metodo de Java que verifica si un String contiene otro String y regresa un booleano
		
		if(loginCorrect) {
			System.out.println("Login Correcto");
		} else {
			System.out.println("Login Incorrecto");
		}
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		// Cerrar Navegador Web
		driver.close();	// Solo cierra la ultima ventana con la que el driver interactuo
		driver.quit();	// Cierra todas las ventanas del navegador
	}

}
