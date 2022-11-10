/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package automationlt;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author sapoj
 */
public class AutomationLTNGTest extends CommonMethods{
    
    
    
    public AutomationLTNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    
   
    
      
    
    
    

    @Test
    public void testMain() throws Exception {
        setUp();
        signUpPage signUp = new signUpPage(driver);
        homePage home = new homePage(driver);
        addItem item = new addItem(driver);
        cartPage cart = new cartPage(driver);
        checkOut check = new checkOut(driver);
        checkOutOverview overview = new checkOutOverview(driver);
        completeOrderPage completePage = new completeOrderPage(driver); 
      
        sendKeys(signUp.userName,"standard_user");
        sendKeys(signUp.password,"secret_sauce");
        clickElement(signUp.loginButton);
        waitFor(home.buyItem);
        String itemName = extractText(home.buyItem);
        clickElement(home.buyItem);
        waitFor(item.boltTShirtAddToCart);
        clickElement(item.boltTShirtAddToCart);
        waitFor(item.cart);
        clickElement(item.cart);
        waitFor(cart.cartItem);
        Assert.assertEquals(extractText(cart.cartItem),itemName);
        waitFor(cart.checkOut);
        clickElement(cart.checkOut);
        waitFor(check.firstName);
        sendKeys(check.firstName,"Alejandro");
        sendKeys(check.lastName,"Jacobo");
        sendKeys(check.zipCode,"12345");
        waitFor(check.next);
        clickElement(check.next);
        waitFor(overview.itemName);
        Assert.assertEquals(extractText(overview.itemName), itemName);
        waitFor(overview.finish);
        clickElement(overview.finish);
        Assert.assertEquals(extractText(completePage.orderHeader),"CHECKOUT: COMPLETE!");
        
        
        
     
        
    }
    
}
