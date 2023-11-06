package TecnicaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
  
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
		}
		
	public WebDriver chromeDriverConnection() {
		
		System.setProperty("webdriver.choreme.driver", "./PruebaaTecnica/src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	
	// Elemento Texto, para resivir como parametro
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
		
	}
	
	
	public void click(By locator) {
		driver.findElement(locator).click();
		
	} 
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
			
		}
		
		
	}
	
   public void visit 	(String url) {
	 driver.get(url);
	 
   }
	
	
}
