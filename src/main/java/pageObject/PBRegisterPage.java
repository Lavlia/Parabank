package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBRegisterPage extends BasePage {
    public PBRegisterPage() {
        super();
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement addressField;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement stateField;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement zipCodeField;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement ssnField;

    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//input[@type='submit' and @value='Register']")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id='topPanel']/a[2]/img")
    private WebElement parabankLogo;

    @FindBy(xpath = "//div[@id='rightPanel']")
    private WebElement registerPanel;

    @FindBy(xpath = "//*[@id='headerPanel']/ul[2]/li[1]/a")
    private WebElement homeSquareButton;

    @FindBy(xpath = "//span[@id='customer.address.zipCode.errors']")
    private WebElement zipCodeErrorMessage;

    @FindBy(xpath = "//span[@id='customer.firstName.errors']")
    private WebElement firstNameErrorMessage;

    @FindBy(xpath = "//span[@id='customer.lastName.errors']")
    private WebElement lastNameErrorMessage;

    @FindBy(xpath = "//span[@id='customer.address.street.errors']")
    private WebElement addressErrorMessage;

    @FindBy(xpath = "//span[@id='customer.address.city.errors']")
    private WebElement cityErrorMessage;

    @FindBy(xpath = "//span[@id='customer.address.state.errors']")
    private WebElement stateErrorMessage;

    @FindBy(xpath = "//span[@id='customer.ssn.errors']")
    private WebElement ssnErrorMessage;

    @FindBy(xpath = "//span[@id='customer.username.errors']")
    private WebElement usernameErrorMessage;

    @FindBy(xpath = "//span[@id='customer.password.errors']")
    private WebElement passwordErrorMessage;

    @FindBy(xpath = "//span[@id='repeatedPassword.errors']")
    private WebElement confirmErrorMessage;

    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getStateField() {
        return stateField;
    }

    public WebElement getZipCodeField() {
        return zipCodeField;
    }

    public WebElement getPhoneNumberField() {
        return phoneNumberField;
    }

    public WebElement getSsnField() {
        return ssnField;
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getParabankLogo() {
        return parabankLogo;
    }

    public WebElement getRegisterPanel() {
        return registerPanel;
    }

    public WebElement getZipCodeErrorMessage() {
        return zipCodeErrorMessage;
    }

    public WebElement getHomeSquareButton() {
        return homeSquareButton;
    }

    public WebElement getFirstNameErrorMessage() {
        return firstNameErrorMessage;
    }

    public WebElement getLastNameErrorMessage() {
        return lastNameErrorMessage;
    }

    public WebElement getAddressErrorMessage() {
        return addressErrorMessage;
    }

    public WebElement getCityErrorMessage() {
        return cityErrorMessage;
    }

    public WebElement getStateErrorMessage() {
        return stateErrorMessage;
    }

    public WebElement getSsnErrorMessage() {
        return ssnErrorMessage;
    }

    public WebElement getUsernameErrorMessage() {
        return usernameErrorMessage;
    }

    public WebElement getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    public WebElement getConfirmErrorMessage() {
        return confirmErrorMessage;
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
