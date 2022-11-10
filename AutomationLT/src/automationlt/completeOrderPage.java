/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automationlt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author sapoj
 */
public class completeOrderPage {
    
    WebDriver driver;
    By orderHeader = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public completeOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    
}
