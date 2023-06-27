package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {
    WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilElementShow(String ElementId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(ElementId)));
    }


    public void waitUntilElementToBeClickable(String ElementId2) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ElementId2)));
    }

    public void clickButton(String buttonId) {
        driver.findElement(By.cssSelector(buttonId)).click();
    }

    public void typeUsername(String areaId, String usernameOrMailAdress) {
        driver.findElement(By.name(areaId)).sendKeys(usernameOrMailAdress);
    }

    public void typePassword(String areaId, String password) {
        driver.findElement(By.name(areaId)).sendKeys(password);
    }
}
