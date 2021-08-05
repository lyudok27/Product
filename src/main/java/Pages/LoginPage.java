package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    WebElement login;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMessage;


    public void loginIn(String yourEmail, String yourPassword) {
        this.email.sendKeys(yourEmail);
        this.password.sendKeys(yourPassword);
        this.login.click();
    }


}
