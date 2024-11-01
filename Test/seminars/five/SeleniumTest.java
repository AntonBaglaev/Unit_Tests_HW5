package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        Thread.sleep(300);

        List<WebElement> searchResult = driver.findElements(By.cssSelector("div"));

        boolean isFound = false;
        for (WebElement webElement : searchResult) {
            System.out.println(webElement.getText());
            if (webElement.getText().contains("https://wwww.sekenium.dev")) {
                isFound = true;
                break;
            }
        }
        assertTrue(isFound);
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        Thread.sleep(300);

        loginButton.click();

        Thread.sleep(3000);

        WebElement productsLabel = driver.findElement(By.className("title"));

        assertEquals("Products", productsLabel.getText());

        driver.quit();
    }

}
