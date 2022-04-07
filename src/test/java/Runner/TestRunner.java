package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//from here i want to execute cucumer file
//can i do it // i want to run login.feature file 

@RunWith(Cucumber.class)



@CucumberOptions(features={"src/test/resources/Login/Login.feature"},
glue= {"Definitation"}
,dryRun = false,
tags= "@PossitiveTestCase",
plugin= {"html:TestOutput/saksham.html","json:TestOutput/saksham.json"}

)
public class TestRunner {

}
