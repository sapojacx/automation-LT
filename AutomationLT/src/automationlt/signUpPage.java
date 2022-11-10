/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automationlt;
import org.openqa.selenium.*;
/**
 *
 * @author sapoj
 */
public class signUpPage{
   
   WebDriver driver;
   By userName = By.id("user-name");
   By password = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input");
   By loginButton = By.name("login-button");

    public signUpPage(WebDriver driver) {
        
        this.driver = driver;
        
    }

 
    
    public void sendUser(String arg1){
    
        driver.findElement(userName).sendKeys(arg1);
    
    }
    
    public void sendPassword(String arg1){
    
        driver.findElement(password).sendKeys(arg1);
    
    }
   
    public void login(){
    
        driver.findElement(loginButton).click();
    
    }
   
   
    
}
