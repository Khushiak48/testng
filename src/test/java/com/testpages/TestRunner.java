package com.testpages;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author Khushboo Taneja
 *
 */

@CucumberOptions(format={"pretty", "json:target/cucumber-json" },
                 features = "classpath:functional",
		        glue = {"com.testpages"}) 


public class TestRunner extends AbstractTestNGCucumberTests {

}
