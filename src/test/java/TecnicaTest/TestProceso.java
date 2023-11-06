package TecnicaTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestProceso {
	
	private WebDriver driver;
	Proceso Procesos;

	@Before
	public void setUp() throws Exception {
		Procesos =  new Proceso(driver);
		driver = Procesos.chromeDriverConnection();
		Procesos.visit("http://localhost/pruebaTecnica/TestingQA/Crear_Procesos.php");
	}
		


	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Procesos.registerProceso();
		assertTrue(Procesos.isHomePageDisplayeds());
	}

}
