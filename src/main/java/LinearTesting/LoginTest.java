package LinearTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    public static WebDriver driver = new ChromeDriver();


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://youtube.com");

        WebElement logo = driver.findElement(By.id("logo-icon"));


    }
}
