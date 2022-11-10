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
public class checkOutOverview {
    
    WebDriver driver; 
    By itemName = By.xpath("//*[@id=\"item_1_title_link\"]/div");
    By finish = By.id("finish");

    public checkOutOverview(WebDriver driver) {
        this.driver = driver;
    }
    
    
    
}
