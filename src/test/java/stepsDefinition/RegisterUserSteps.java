package stepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pageObject.BaseUtil;
import pageObject.PBAccountPage;
import pageObject.PBHomePage;
import pageObject.PBRegisterPage;

import java.util.List;
import java.util.Map;

public class RegisterUserSteps extends BaseUtil {

    PBHomePage pbHomePage = new PBHomePage();
    PBAccountPage pbAccountPage = new PBAccountPage();
    PBRegisterPage pbRegisterPage = new PBRegisterPage();

    //Start background
    @Given("Account holder is on Parabank Website")
    public void accountHolderIsOnParabankWebsite() {
        getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Account holder press on Register link")
    public void accountHolderPressOnRegisterLink() {
        pbHomePage.clickOnElement(pbHomePage.getRegisterButton());
    }

    @Then("The account holder should see the Register page")
    public void theAccountHolderShouldSeeTheRegisterPage() {
        Assert.assertTrue(pbRegisterPage.getRegisterPanel().getAttribute("textContent").
                contains("Signing up is easy!"));
    }


    //First scenario - TC01
    @When("The account holder is filling all the fields")
    public void theAccountHolderIsFillingAllTheFields(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (int i = 0; i < data.size(); i++) {
            pbRegisterPage.getFirstNameField().sendKeys(data.get(i).get("First name"));
            pbRegisterPage.getLastNameField().sendKeys(data.get(i).get("Last name"));
            pbRegisterPage.getAddressField().sendKeys(data.get(i).get("Address"));
            pbRegisterPage.getCityField().sendKeys(data.get(i).get("City"));
            pbRegisterPage.getStateField().sendKeys(data.get(i).get("State"));
            pbRegisterPage.getZipCodeField().sendKeys(data.get(i).get("Zip Code"));
            pbRegisterPage.getPhoneNumberField().sendKeys(data.get(i).get("Phone"));
            pbRegisterPage.getSsnField().sendKeys(data.get(i).get("SSN"));
            pbRegisterPage.getUsernameField().sendKeys(data.get(i).get("Username"));
            pbRegisterPage.getPasswordField().sendKeys(data.get(i).get("Password"));
            pbRegisterPage.getConfirmPasswordField().sendKeys(data.get(i).get("Confirm"));
        }
    }

    @And("Account holder press on REGISTER button")
    public void accountHolderPressOnREGISTERButton() {
        pbRegisterPage.clickOnElement(pbRegisterPage.getRegisterButton());
    }

    @Then("The account holder should see a success message")
    public void theAccountHolderShouldSeeASuccessMessage() {
        Assert.assertTrue(pbAccountPage.getWelcomePannel().getAttribute("textContent").contains("Welcome"));

    }

    @When("Account holder press the Log Out button")
    public void accountHolderPressTheLogOutButton() {
        pbAccountPage.clickOnElement(pbAccountPage.getLogOutButton());
    }

    @Then("The account holder should see the Home page")
    public void theAccountHolderShouldSeeTheHomePage() {
        Assert.assertTrue(pbHomePage.getCustomerLogin().getAttribute("textContent").contains("Customer Login"));
    }


    //Second scenario - TC02
    @When("The account holder is filling all the fields with invalid data")
    public void theAccountHolderIsFillingAllTheFieldsWithInvalidData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (int i = 0; i < data.size(); i++) {
            pbRegisterPage.getFirstNameField().sendKeys(data.get(i).get("First name"));
            pbRegisterPage.getLastNameField().sendKeys(data.get(i).get("Last name"));
            pbRegisterPage.getAddressField().sendKeys(data.get(i).get("Address"));
            pbRegisterPage.getCityField().sendKeys(data.get(i).get("City"));
            pbRegisterPage.getStateField().sendKeys(data.get(i).get("State"));
            pbRegisterPage.getZipCodeField().sendKeys(data.get(i).get("Zip Code"));
            pbRegisterPage.getPhoneNumberField().sendKeys(data.get(i).get("Phone"));
            pbRegisterPage.getSsnField().sendKeys(data.get(i).get("SSN"));
            pbRegisterPage.getUsernameField().sendKeys(data.get(i).get("Username"));
            pbRegisterPage.getPasswordField().sendKeys(data.get(i).get("Password"));
            pbRegisterPage.getConfirmPasswordField().sendKeys(data.get(i).get("Confirm"));
        }
    }

    @Then("The account holder should see a fail message")
    public void theAccountHolderShouldSeeAFailMessage() {
        Assert.assertFalse(pbAccountPage.getWelcomePannel().getAttribute("textContent").contains("Welcome"));
    }

    @When("Account holder press the Parabank Logo")
    public void accountHolderPressTheParabankLogo() {
        pbRegisterPage.clickOnElement(pbRegisterPage.getParabankLogo());


    }


    //Third scenario - TC03
    @When("The account holder is filling all the fields with valid data and all but one field not filled")
    public void theAccountHolderIsFillingAllTheFieldsWithValidDataAndAllButOneFieldNotFilled(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (int i = 0; i < data.size(); i++) {
            pbRegisterPage.getFirstNameField().sendKeys(data.get(i).get("First name"));
            pbRegisterPage.getLastNameField().sendKeys(data.get(i).get("Last name"));
            pbRegisterPage.getAddressField().sendKeys(data.get(i).get("Address"));
            pbRegisterPage.getCityField().sendKeys(data.get(i).get("City"));
            pbRegisterPage.getStateField().sendKeys(data.get(i).get("State"));
            pbRegisterPage.getZipCodeField().sendKeys(data.get(i).get("Zip Code"));
            pbRegisterPage.getPhoneNumberField().sendKeys(data.get(i).get("Phone"));
            pbRegisterPage.getSsnField().sendKeys(data.get(i).get("SSN"));
            pbRegisterPage.getUsernameField().sendKeys(data.get(i).get("Username"));
            pbRegisterPage.getPasswordField().sendKeys(data.get(i).get("Password"));
            pbRegisterPage.getConfirmPasswordField().sendKeys(data.get(i).get("Confirm"));
        }
    }

    @Then("The account holder should see a required field message")
    public void theAccountHolderShouldSeeARequiredFieldMessage() {
        Assert.assertTrue(pbRegisterPage.getZipCodeErrorMessage().isDisplayed());
    }


    //Fourth scenario - TC04
    @When("The account holder is filling all the fields with no data")
    public void theAccountHolderIsFillingAllTheFieldsWithNoData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (int i = 0; i < data.size(); i++) {
            pbRegisterPage.getFirstNameField().sendKeys(data.get(i).get("First name"));
            pbRegisterPage.getLastNameField().sendKeys(data.get(i).get("Last name"));
            pbRegisterPage.getAddressField().sendKeys(data.get(i).get("Address"));
            pbRegisterPage.getCityField().sendKeys(data.get(i).get("City"));
            pbRegisterPage.getStateField().sendKeys(data.get(i).get("State"));
            pbRegisterPage.getZipCodeField().sendKeys(data.get(i).get("Zip Code"));
            pbRegisterPage.getPhoneNumberField().sendKeys(data.get(i).get("Phone"));
            pbRegisterPage.getSsnField().sendKeys(data.get(i).get("SSN"));
            pbRegisterPage.getUsernameField().sendKeys(data.get(i).get("Username"));
            pbRegisterPage.getPasswordField().sendKeys(data.get(i).get("Password"));
            pbRegisterPage.getConfirmPasswordField().sendKeys(data.get(i).get("Confirm"));
        }
    }

    @Then("The account holder should see a required fields message")
    public void theAccountHolderShouldSeeARequiredFieldsMessage() {
        Assert.assertTrue(pbRegisterPage.getFirstNameErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getLastNameErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getAddressErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getCityErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getStateErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getZipCodeErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getSsnErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getUsernameErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getPasswordErrorMessage().isDisplayed());
        Assert.assertTrue(pbRegisterPage.getConfirmErrorMessage().isDisplayed());
    }

    @When("Account holder press the home square button")
    public void accountHolderPressTheHomeSquareButton() {
        pbRegisterPage.clickOnElement(pbRegisterPage.getHomeSquareButton());
    }

    //Fifth scenario - TC05
    @When("The account holder is filling all the fields with valid data")
    public void theAccountHolderIsFillingAllTheFieldsWithValidData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (int i = 0; i < data.size(); i++) {
            pbRegisterPage.getFirstNameField().sendKeys(data.get(i).get("First name"));
            pbRegisterPage.getLastNameField().sendKeys(data.get(i).get("Last name"));
            pbRegisterPage.getAddressField().sendKeys(data.get(i).get("Address"));
            pbRegisterPage.getCityField().sendKeys(data.get(i).get("City"));
            pbRegisterPage.getStateField().sendKeys(data.get(i).get("State"));
            pbRegisterPage.getZipCodeField().sendKeys(data.get(i).get("Zip Code"));
            pbRegisterPage.getPhoneNumberField().sendKeys(data.get(i).get("Phone"));
            pbRegisterPage.getSsnField().sendKeys(data.get(i).get("SSN"));
            pbRegisterPage.getUsernameField().sendKeys(data.get(i).get("Username"));
            pbRegisterPage.getPasswordField().sendKeys(data.get(i).get("Password"));
            pbRegisterPage.getConfirmPasswordField().sendKeys(data.get(i).get("Confirm"));
        }
    }

    @And("The account holder is filling again the fields with the same data")
    public void theAccountHolderIsFillingAgainTheFieldsWithTheSameData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (int i = 0; i < data.size(); i++) {
            pbRegisterPage.getFirstNameField().sendKeys(data.get(i).get("First name"));
            pbRegisterPage.getLastNameField().sendKeys(data.get(i).get("Last name"));
            pbRegisterPage.getAddressField().sendKeys(data.get(i).get("Address"));
            pbRegisterPage.getCityField().sendKeys(data.get(i).get("City"));
            pbRegisterPage.getStateField().sendKeys(data.get(i).get("State"));
            pbRegisterPage.getZipCodeField().sendKeys(data.get(i).get("Zip Code"));
            pbRegisterPage.getPhoneNumberField().sendKeys(data.get(i).get("Phone"));
            pbRegisterPage.getSsnField().sendKeys(data.get(i).get("SSN"));
            pbRegisterPage.getUsernameField().sendKeys(data.get(i).get("Username"));
            pbRegisterPage.getPasswordField().sendKeys(data.get(i).get("Password"));
            pbRegisterPage.getConfirmPasswordField().sendKeys(data.get(i).get("Confirm"));
        }
    }

    @Then("The account holder should see an error message")
    public void theAccountHolderShouldSeeAnErrorMessage() {
        Assert.assertTrue(pbRegisterPage.getUsernameErrorMessage().isDisplayed());

    }
}
