package Rovers.Mars.cucumber.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * This is '.java' file. Acts as main method in JAVA.
 * Execution starts from here in cucumber projects.
 * In this file we define all our attributes.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Rovers/Mars/cucumber/resourses/featurefile",
        glue = "Rovers/Mars/cucumber",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "rerun:target/rerun.txt"},
        tags = {"@Test"}
)

public class TestRunner {
    @AfterClass
    public static void setUp() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/Rovers/Mars/cucumber/resourses/extentreport/extent_config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "4.9.0");
        Reporter.setSystemInfo("Maven", "3.9.1");
        Reporter.setSystemInfo("Java Version", "1.8.0_121");
    }
}
