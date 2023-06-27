package Tests;

import Pages.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InstagramTests {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test
    void instagramLoginTesti() throws InterruptedException {
        driver.get("https://www.instagram.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));

        loginPage.waitUntilElementShow(loginPage.usernameOrMailAdress);
        loginPage.typeUsername(loginPage.usernameOrMailAdress, "XXXX");
        loginPage.typePassword(loginPage.password, "123456");
        loginPage.waitUntilElementToBeClickable(loginPage.loginButton);
        loginPage.clickButton(loginPage.loginButton);
        Thread.sleep(3000L);
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }
}
