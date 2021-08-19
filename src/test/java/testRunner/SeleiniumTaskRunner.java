package testRunner;


import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features="src/test/java/features/seleniumTask.feature"
, glue= {"stepDef","pages","utilities"}
, plugin= {"pretty","html:resources/reports/seleniumTask.html"})
public class SeleiniumTaskRunner extends TestBase {

}