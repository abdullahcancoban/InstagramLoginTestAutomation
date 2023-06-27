package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    public final String usernameOrMailAdress = "username";
    public final String password = "password";

    public final String loginButton = "button[type='submit']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
