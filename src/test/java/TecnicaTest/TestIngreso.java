package TecnicaTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

//import com.daniel.prueba.RegistroPagina;

public class TestIngreso {
	
	private WebDriver driver;
	PaginaRegistro registerPage;

	@Before
	public void setUp() throws Exception {
		registerPage =  new PaginaRegistro(driver);
		driver = registerPage.chromeDriverConnection();
		registerPage.visit("http://localhost/pruebaTecnica/TestingQA/Index.php");
	}

	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		registerPage.registerUser();
		assertTrue(registerPage.isHomePageDisplayed());
	}

}
