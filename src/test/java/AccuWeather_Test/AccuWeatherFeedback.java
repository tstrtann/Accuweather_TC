package AccuWeather_Test;

import AccuWeatherFeedBack.FeedbackPage;
import AccuWeatherFeedBack.LandingPage;
import Configs.BrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccuWeatherFeedback extends BrowserTest {

    /*
    User should be able to use the Feedback Features and report
    information about their concerns.

     */

    @Test(priority = 1)
    public void LandingPage() {
        LandingPage lp = new LandingPage(driver);
        lp.feedbackBtnClick();
    }

    @Test(priority = 2)
    public void FeedbackPage() {
        FeedbackPage fp = new FeedbackPage(driver);
        fp.feedbackInputFields(
                "Picaso",
                "Lassi",
                "1234567788",
                "thisisaTestin@gmail.com",
                "The Test Business");

        fp.enviromentSelect("Mobile Web");
    }

    @Test(dependsOnMethods = "FeedbackPage")
    public void AssertEmail() {

        // Validate the contact email is "PR@accuweather.com"
        WebElement email = driver.findElement(By.linkText("PR@accuweather.com"));
        String actualEmailText = email.getText();
        String expectedEmailText = "PR@accuweather.com";

        Assert.assertEquals(actualEmailText, expectedEmailText);
//

    }


}
