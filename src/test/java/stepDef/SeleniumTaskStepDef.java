package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SeleniumTask;
import utilities.ExtentReport;
import utilities.TestBase;

import java.io.IOException;

import static pages.SeleniumTask.*;
import static utilities.Screenshot.saveScreenshot;

public class SeleniumTaskStepDef extends TestBase {

    // =========================Login Scenario===================================
    @Given("Url is opened")
    public void url_is_opened() {
        ExtentReport.startTC("Validate the Login ");
        openWebsite();
    }

    @And("user enter valid mail {string}  and password {string}")
    public void userEnterValidMailAndPassword(String arg0, String arg1) {
        SeleniumTask.enterUserName(arg0);
        SeleniumTask.enterPassword(arg1);
    }

    @When("user click on login btn")
    public void user_click_on_login_btn() {
        SeleniumTask.clickOnLoginBtn();
    }

    @Then("user redirected to the homepage")
    public void userRedirectedToThHomepage() throws IOException {
        validateDashboardIsReturned();
        saveScreenshot(TestBase.driver, "Validate the correct page redirection when login successfully ");
    }


    // =========================navigate to users===================================

    @And("user click on admin tab")
    public void userClickOnAdminTab() {
        clickOnAdmin();
    }

    @And("user click on User management tab")
    public void userClickOnUserManagementTab() {
        clickonUsermanagement();
    }

    @And("user click on Users tab")
    public void userClickOnUsersTab() {
        clickOnUsers();
    }

    @Then("user redirected to the users page")
    public void userRedirectedToTheUsersPage() throws IOException {
        validateUsersPageIsReturned();
        saveScreenshot(TestBase.driver, "Validate the correct page redirection when navigate to user successfully ");

    }

    // =========================create user===================================

    @And("user click on Add Button")
    public void userClickOnAddButton() {
        ClickOnAddBtn();
    }

    @And("user enter Employee Name {string}")
    public void userEnterEmployeeName(String arg0) {
        enterEmployeeName(arg0);
    }

    @And("user enter System User Name {string}")
    public void userEnterSystemUserName(String arg0) {
        enterSystemUserName(arg0);
    }

    @And("user enter System Password {string}")
    public void userEnterSystemPassword(String arg0) {
        enterSystemPassword(arg0);
    }

    @And("user enter System confirm Name {string}")
    public void userEnterSystemConfirmName(String arg0) {
        enterSystemConfirmPassword(arg0);
    }

    @When("user click on Save Btn")
    public void userClickOnSaveBtn() {
        ClickOnSaveBtn();
    }

    @Then("user is added successfully")
    public void userIsAddedSuccessfully() {
        validateUsersPageIsReturnedaftersaving();
    }


    // =========================Delete user===================================


    @And("Admin search for the needed user {string}")
    public void adminSearchForTheNeededUser(String arg0) {
        enterSearchName(arg0);
    }

    @And("Click on search button")
    public void clickOnSearchButton() {
        ClickOnSearchBtn();
    }

    @And("click to choose the user")
    public void clickToChooseTheUser() {
        selectAddedUser();
    }

    @And("user click on Delete Button")
    public void userClickOnDeleteButton() {
        ClickOnDeleteBtn();
    }

    @And("click on ok button")
    public void clickOnOkButton() {
        ClickOnOkBtn();
    }

    @Then("user is deleted")
    public void userIsDeleted() {
        validateUsersPageIsReturnedafterdelete();
    }

}
