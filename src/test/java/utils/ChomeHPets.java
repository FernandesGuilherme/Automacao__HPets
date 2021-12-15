package utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChomeHPets {
    private WebDriver driver;
    private String baseUrl = "https://healthpets.app.br";

    @Before
    public WebDriver AbrirNavegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);

        return driver;
    }

    @After
    public WebDriver fecharNavegador (){
        driver.quit();

        return driver;
    }
}
