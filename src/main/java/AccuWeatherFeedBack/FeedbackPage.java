package AccuWeatherFeedBack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FeedbackPage {

    WebDriver driver;



    @FindBy(xpath = "//*[@name='firstname']")
    WebElement fNameField;

    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lNameField;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement phoneNumberField;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@name='company']")
    WebElement companyNameField;

    @FindBy(xpath = "//*[@name='support_issue']")
    WebElement enviromentSelection;

    public FeedbackPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void feedbackInputFields(String fName, String lName,
    String phoneNum, String email, String company) {

        fNameField.sendKeys(fName);
        lNameField.sendKeys(lName);
        phoneNumberField.sendKeys(phoneNum);
        emailField.sendKeys(email);
        companyNameField.sendKeys(company);

    }

    public void enviromentSelect(String envType) {
        Select select = new Select(enviromentSelection);
        select.selectByValue(envType);
    }

}
