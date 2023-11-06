package TecnicaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaRegistro extends Base{

	By resgisterPageLocater = By.xpath("//h2[contains(text(),'Iniciar Sesión')]");
	
	By usernameLocator = By.id("username");
	By passwordLocator = By.name("password");
	By registerBtnLocator = By.name("submit");
	By registereMessage = By.xpath("//h2[contains(text(),'Accedió')]");
	
	public PaginaRegistro(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() throws InterruptedException {
        if (isDisplayed(resgisterPageLocater)) {
        	type("Daniel.Diaz",usernameLocator);
        	Thread.sleep(1000);
        	type ("Daniel123",passwordLocator);
        	Thread.sleep(3000);
        	click(registerBtnLocator);  
        	
        	
         }else {
        	 System.out.println("Not Found 404");
         }
	}
	
	   public boolean isHomePageDisplayed()  {
			return isDisplayed(registereMessage);
			
		}
		

}

	
