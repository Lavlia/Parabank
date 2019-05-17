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

public class RegisterUserSteps extends BaseUtil {

    PBHomePage pbHomePage = new PBHomePage();
    PBAccountPage pbAccountPage = new PBAccountPage();
    PBRegisterPage pbRegisterPage = new PBRegisterPage();

    //Start background
    @Given("Account holder is on Parabank Website")
    public void accountHolderIsOnParabankWebsite() {
        getDriver().get(URL);
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
        pbRegisterPage.fillingFieldsWithData(table);
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
        pbRegisterPage.fillingFieldsWithData(table);
    }

    @Then("The account holder should see a fail message")
    public void theAccountHolderShouldSeeAFailMessage() {
        Assert.assertFalse(pbAccountPage.getWelcomePannel().getAttribute("textContent").contains("Welcome"));
    }


    //Third scenario - TC03
    @When("The account holder is filling all the fields with valid data and all but zip code field not filled")
    public void theAccountHolderIsFillingAllTheFieldsWithValidDataAndAllButZipCodeFieldNotFilled(DataTable table) {
        pbRegisterPage.fillingFieldsWithData(table);
    }

    @Then("The account holder should see a required field message")
    public void theAccountHolderShouldSeeARequiredFieldMessage() {
        Assert.assertTrue(pbRegisterPage.getZipCodeErrorMessage().isDisplayed());
    }


    //Fourth scenario - TC04
    @When("The account holder is filling all the fields with no data")
    public void theAccountHolderIsFillingAllTheFieldsWithNoData(DataTable table) {
        pbRegisterPage.fillingFieldsWithData(table);
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


    //Fifth scenario - TC05
    @When("The account holder is filling all the fields with valid data")
    public void theAccountHolderIsFillingAllTheFieldsWithValidData(DataTable table) {
        pbRegisterPage.fillingFieldsWithData(table);
    }

    @And("The account holder is filling again the fields with the same data")
    public void theAccountHolderIsFillingAgainTheFieldsWithTheSameData(DataTable table) {
        pbRegisterPage.fillingFieldsWithData(table);
    }

    @Then("The account holder should see an error message")
    public void theAccountHolderShouldSeeAnErrorMessage() {
        Assert.assertTrue(pbRegisterPage.getUsernameErrorMessage().isDisplayed());

    }
}
