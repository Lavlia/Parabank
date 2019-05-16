package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBAccountPage extends BasePage {
    public PBAccountPage() {
        super();
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logOutButton;

    @FindBy(xpath = "//div[@id='rightPanel']")
    private WebElement welcomePannel;

    public WebElement getLogOutButton() {
        return logOutButton;
    }

    public WebElement getWelcomePannel() {
        return welcomePannel;
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
