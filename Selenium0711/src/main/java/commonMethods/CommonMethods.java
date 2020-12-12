package commonMethods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);	// Toma el screenshot de la pagina
		String screenshotPath = Paths.get("").toAbsolutePath().toString() + File.separator + "test-output" + File.separator + "ExecutionResult";	// Establece la ruta donde se va a guardar el screenshot
		
		try {
			FileHandler.createDir(new File(screenshotPath));	// Creamos el folder usando la ruta especificada en la variable "screenshot"
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));	// Copiar el screenshot generado en el objeto "scrFile" a la ruta especificada en "screenshot"
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
