package testRunner;


import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features="src/test/java/features/SheepCount.feature"
, glue= {"stepDef","pages","utilities"}
, plugin= {"pretty","html:resources/reports/SheepCount.html"})
public class CountSheepRunner extends TestBase {

}