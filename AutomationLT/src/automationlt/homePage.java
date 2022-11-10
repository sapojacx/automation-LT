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
public class homePage {
   
   WebDriver driver;
   By buyItem = By.xpath("//*[@id=\"item_1_title_link\"]/div");
   
    public homePage (WebDriver driver) {
        
        this.driver = driver;
        
    }
    
   
   
}
