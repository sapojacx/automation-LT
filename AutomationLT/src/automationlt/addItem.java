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
public class addItem {
    
    WebDriver driver;
    By boltTShirtAddToCart = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public addItem(WebDriver driver) {
        this.driver = driver;
    }
    
    
    
 
    
}
