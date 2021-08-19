package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import utilities.TestBase;

public class SeleniumTask extends TestBase {

    //----------------------------------Login page Elements---------------------------------------
    @FindBy(id = "txtUsername")
    public static WebElement userName; //User Name text field

    @FindBy(id = "txtPassword")
    public static WebElement password; //Password text field

    @FindBy(id = "btnLogin")
    public static WebElement loginbtn ; //Login Button

    @FindBy(id = "menu_admin_viewAdminModule")
    public static WebElement admin ; //admin menu

    @FindBy(id = "menu_admin_UserManagement")
    public static WebElement userManagement ; //user management menu

    @FindBy(id = "menu_admin_viewSystemUsers")
    public static WebElement users ; //Users Menu

    @FindBy(id = "btnAdd")
    public static WebElement addBtn ; // Add Btn

    @FindBy(id = "systemUser_userName")
    public static WebElement systemUserName ; // System User Name

    @FindBy(id = "systemUser_employeeName_empName")
    public static WebElement employeeName ; // employee Name

    @FindBy(id = "systemUser_password")
    public static WebElement systemPassword ; //system Password

    @FindBy(id = "systemUser_confirmPassword")
    public static WebElement systemConfirmPassword ; //system Confirm Password
    @FindBy(id = "btnSave")
    public static WebElement saveBtn ; //save Button

    @FindBy(id = "searchSystemUser_userName")
    public static WebElement searchUserName ; //search User Name

    @FindBy(id = "searchBtn")
    public static WebElement searchBtn ; //search button

    @FindBy(id = "ohrmList_chkSelectRecord_45")
    public static WebElement selectCreatedUser ; //select Created User

    @FindBy(id = "btnDelete")
    public static WebElement deleteBtn ; //Delete Button

    @FindBy(id = "dialogDeleteBtn")
    public static WebElement okBtnToDelete ; //ok Btn To Delete


    //=====================================Actions==========================================
    public static void enterUserName(String userNamevalue)
    {
        userName.sendKeys(userNamevalue);
    }
    public static void enterPassword(String passwordvalue)
    {
        password.sendKeys(passwordvalue);
    }
    public static void clickOnLoginBtn()
    {
        loginbtn.click();
    }
    public static void validateadminMenu(){admin.isDisplayed();}
    public static void clickOnAdmin(){admin.click();}
    public static void clickonUsermanagement(){userManagement.click();}
    public static void clickOnUsers(){users.click();}
    public static void validateAddBtn(){addBtn.isDisplayed();}
    public static void ClickOnAddBtn(){addBtn.click();}
    public static void enterEmployeeName(String employeeNameValue){employeeName.sendKeys(employeeNameValue);}
    public static void enterSystemUserName(String systemUserNameValue){systemUserName.sendKeys(systemUserNameValue);}
    public static void enterSystemPassword(String systemPasswordValue){systemPassword.sendKeys(systemPasswordValue);}
    public static void enterSystemConfirmPassword(String systemConfirmPasswordValue){systemConfirmPassword.sendKeys(systemConfirmPasswordValue);}
    public static void ClickOnSaveBtn(){saveBtn.click();}
    public static void enterSearchName(String searchNameValue){searchUserName.sendKeys(searchNameValue);}
    public static void ClickOnSearchBtn(){searchBtn.click();}
    public static void ClickOnDeleteBtn(){deleteBtn.click();}
    public static void ClickOnOkBtn(){okBtnToDelete.click();}
    public static void selectAddedUser(){selectCreatedUser.click();}
    public static void validateDashboardIsReturned(){
        String DashboardURL = driver.getCurrentUrl();
        Assert.assertEquals(DashboardURL, "https://opensource-demo.orangehrmlive.com/index.php/dashboard" );
    }
    public static void validateUsersPageIsReturned(){
        String UsersPageURL = driver.getCurrentUrl();
        Assert.assertEquals(UsersPageURL, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers" );
    }

    public static void validateUsersPageIsReturnedaftersaving(){
        String UsersPageURL = driver.getCurrentUrl();
        Assert.assertEquals(UsersPageURL, "https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser" );
    }

    public static void validateUsersPageIsReturnedafterdelete(){
        String UsersPageURL = driver.getCurrentUrl();
        Assert.assertEquals(UsersPageURL, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers" );
    }


    //================================constructor======================================================
    public SeleniumTask(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
