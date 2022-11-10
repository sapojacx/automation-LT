package automationlt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sapoj
 */
public class checkOut {
    
    WebDriver driver;
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By next = By.id("continue");

    public checkOut(WebDriver driver) {
        this.driver = driver;
    }
    
    
    
    
}
