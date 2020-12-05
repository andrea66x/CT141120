package assertsEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEj {
	
  @Test
  public void assertEquals() {
	  int a = 10;
	  int b = 10;
	  Assert.assertNotEquals(a,b);
  }
  
  @Test
  public void assertNotEquals() {
	  int a = 5;
	  int b = 10;
	  Assert.assertNotEquals(a, b);
  }
  
  @Test
  public void assertTrue() {
	  int a = 10;
	  int b = 10;
	  Assert.assertTrue(a == b);
  }
  
  @Test
  public void verificarTituloDePagina() {
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;	// Traer el path del proyecto y el separator es el '/' y con esto seteamos el path de nuestro driver
	  System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); 	// Identificando el ejecutable para el driver
	  WebDriver driver = new ChromeDriver();	// Creacion en tiempo de ejecucion de nuestro ChromeDriver
	  driver.get("https://opensource-demo.orangehrmlive.com/");	// Abriendo el Chrome con la URL especificada
	  driver.manage().window().maximize();	// Maximiza la Ventana
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "OrangeHRM";
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
}
