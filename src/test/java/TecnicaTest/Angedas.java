package TecnicaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Angedas extends Base {

	
	By ValidarIgresos = By.xpath("//h2[contains(text(),'Crear Agendas:')]");
	By Locator_id_proceso = By.id("id_proceso");
	By Locator_inicial = By.id("fecha_inicial");
	By Locator_final = By.id("fecha_final");
	By Locator_tipo_documento = By.name("id_tipo_documento");
	By Locator_documento = By.name("documento");
	By Locator_email = By.name("email");
	By BtnLocator = By.name("submit");
	By ValidarFin = By.xpath("//h2[contains(text(),'Datos Enviados')]");
	
	
	public Angedas(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerAgenda () throws InterruptedException {
        if (isDisplayed(ValidarIgresos)) {
        	type("1718",Locator_id_proceso);
        	Thread.sleep(1000);
        	type ("2023-02-09",Locator_inicial);
        	Thread.sleep(1000);
        	type("2023-02-10",Locator_final);
        	Thread.sleep(1000);
        	type("1",Locator_tipo_documento);
        	Thread.sleep(1000);
        	type("1192811",Locator_documento);
        	Thread.sleep(1000);
        	type ("prueba123@gamil.com",Locator_email);
        	Thread.sleep(2000);
        	click (BtnLocator);
        	      	
        	
         }else {
        	 System.out.println("Not Found 404");
         }
	}
	
	   public boolean HomePageDisplayeds()  {
			return isDisplayed(ValidarFin);
			
		}


}
