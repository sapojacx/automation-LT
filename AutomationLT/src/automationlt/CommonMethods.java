/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automationlt;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author sapoj
 */
public class CommonMethods {
    
    WebDriver driver;
    private String baseURL;
    Actions actionS;
    WebDriverWait exWait;
    
   
public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    baseURL = "https://www.saucedemo.com/";
    driver.get(baseURL);
    //actionS = new Actions(driver);
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //exWait = new WebDriverWait(driver,Duration.ofSeconds(10));
  }    

public void waitFor(By element) throws Exception{
    exWait = new WebDriverWait(driver,Duration.ofSeconds(60));
    exWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    
}

public String extractText(By element) {

   
   System.out.println(driver.findElement(element).getText());
   return driver.findElement(element).getText();
}

 public void clickElement(By element){
    
       driver.findElement(element).click();
        
    }
 
public void sendKeys(By element,String arg1){

    driver.findElement(element).sendKeys(arg1);
    
}
   
    
    
}
