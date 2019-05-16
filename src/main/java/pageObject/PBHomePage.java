package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage extends BasePage {
    public PBHomePage() {
        super();
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='leftPanel']/h2")
    private WebElement customerLogin;

    @FindBy(xpath = "//*[@id='topPanel']/a[2]/img")
    private WebElement parabankLogo;

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getCustomerLogin() {
        return customerLogin;
    }

    public WebElement getParabankLogo() {
        return parabankLogo;
    }

    @Override
    public void clickOnElement(WebElement element) {
        super.clickOnElement(element);
    }

    @Override
    public void waitForVisibility(WebElement element) {
        super.waitForVisibility(element);
    }
}
