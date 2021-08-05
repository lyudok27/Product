import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage page ;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        page = new LoginPage(driver);
    }
   // @AfterMethod
   // public void tearDown(){
     //   driver.quit();
   // }
    @Test
    public void loginWithValidCredentials(){
        driver.get("https://www.facebook.com");
        page.loginIn("lyudmilka86@hotmail.com","Hapyluda27!");
        String actual = page.errorMessage.getText().trim();
        String expected= "The password you’ve entered is incorrect. Forgot Password?";
        Assert.assertEquals(actual,expected);

    }
}
