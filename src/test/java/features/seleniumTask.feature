Feature: Selenium Task


  Scenario Outline: as an admin user i want to be able to login
    Given Url is opened
    And user enter valid mail "<userNameValue>"  and password "<passwordValue>"
    When user click on login btn
    Then user redirected to the homepage

    Examples:
      | userNameValue | passwordValue |
      | Admin         | admin123      |


  Scenario: as an admin user i want to be able to navigate to users page
    Given user redirected to the homepage
    And user click on admin tab
    And user click on User management tab
    And user click on Users tab
    Then user redirected to the users page


  Scenario Outline: as an admin user i want to be able to Add New user
    Given user redirected to the users page
    And user click on Add Button
    And user enter Employee Name "<employeeName>"
    And user enter System User Name "<systemUserName>"
    And user enter System Password "<systemPassword>"
    And user enter System confirm Name "<systemConfirmPassword>"
    When user click on Save Btn
    Then user is added successfully

    Examples:
      | employeeName | systemUserName | systemPassword | systemConfirmPassword |
      | Aaliyah Haq  | AhmedNaguib123   | Ahmed12345     | Ahmed12345            |

  Scenario Outline: as an admin user i want to be able to Delete user
    Given user is added successfully
    And Admin search for the needed user "<userToDelete>"
    And Click on search button
    And click to choose the user
    And user click on Delete Button
    And click on ok button
    Then user is deleted
    Examples:
      | userToDelete |
      | AhmedNaguib123 |