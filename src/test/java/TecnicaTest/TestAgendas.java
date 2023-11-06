package TecnicaTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestAgendas {
	
	private WebDriver driver;
	Angedas Agenda;

	@Before
	public void setUp() throws Exception {
		Agenda =  new Angedas(driver);
		driver = Agenda.chromeDriverConnection();
		Agenda.visit("http://localhost/pruebaTecnica/TestingQA/Agendas.php");
	}

	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	
	public void test() throws InterruptedException {
		Agenda.registerAgenda();
		assertTrue(Agenda.HomePageDisplayeds());
	}

}
