package TecnicaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Proceso extends Base {
	
	By confirmarMensaje = By.xpath("//h2[contains(text(),'Crear Procesos:')]");
	By Locator_proceso = By.id("proceso_nombre");
	By Locator_cierre = By.name("fecha_cierre");
	By Locator_estado = By.name("proceso_estado");
	By Locator_identidad = By.id("verificacion_identidad");
	By Locator_id = By.name("id_prueba");
	By Locator_perfil = By.name("id_perfil");
	By Locator_porcentual = By.id("valor_porcentual");
	By RegisterBtnLocator = By.name("submit");
	By ValidarIgreso = By.xpath("//h2[contains(text(),'Ingreso exitoso.')]");

	public Proceso(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerProceso () throws InterruptedException {
        if (isDisplayed(confirmarMensaje)) {
        	type("Proceso 2.0.1.2",Locator_proceso);
        	Thread.sleep(1000);
        	type ("2022-07-18",Locator_cierre);
        	Thread.sleep(1000);
        	click(Locator_estado);
        	Thread.sleep(1000);
        	click(Locator_identidad);
        	Thread.sleep(1000);
        	type("1",Locator_id);
        	Thread.sleep(1000);
        	type ("18",Locator_perfil);Thread.sleep(1000);
        	type ("50",Locator_porcentual);
        	Thread.sleep(2000);
        	click(RegisterBtnLocator);  
        	
        	
         }else {
        	 System.out.println("Not Found 404");
         }
	}
	
	   public boolean isHomePageDisplayeds()  {
			return isDisplayed(ValidarIgreso);
			
		}

}
