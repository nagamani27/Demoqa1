package stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )
@CucumberOptions(features="C:\\Users\\RC\\eclipse-workspace\\Project6\\src\\test\\resources\\Features\\Test.feature",tags= {"@textbox, @checkbox"},glue="C:\\Users\\RC\\eclipse-workspace\\Project6\\src\\test\\java\\stepdefination",plugin= {"pretty","html:C:\\Users\\RC\\eclipse-workspace\\Project6\\target\\report\\htmlrepot"})
public class Runner {

}
