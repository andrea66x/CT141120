package seleniumEj;

import java.io.File;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitEj {

	public static void main(String[] args) {
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;	// Traer el path del proyecto y el separator es el '/' y con esto seteamos el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); 	// Identificando el ejecutable para el driver
		WebDriver driver = new ChromeDriver();	// Creacion en tiempo de ejecucion de nuestro ChromeDriver
		driver.get("https://opensource-demo.orangehrmlive.com/");	// Abriendo el Chrome con la URL especificada
		driver.manage().window().maximize();	// Maximiza la Ventana
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(20))	// Esperando 20 segundos a que el elemento este presente en la 
								.pollingEvery(Duration.ofSeconds(2))	// Verificando el elemento cada 2 segundos
								.ignoring(NoSuchElementException.class);	// La excepcion que va a evitar durante 20 segundos
		
		WebElement txtUsername = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				driver.navigate().refresh();
				return driver.findElement(By.id("txtUsername"));  // Si se pone mal este ID por ejemplo "txtUsernam" se hace el refresh cada 2 segundos
			}
		});
		
		txtUsername.click();

	}

}
