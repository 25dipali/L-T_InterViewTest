package CucumberTest.CucumberTest;


import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "feature" 
		 ,glue={"CucumberTest.CucumberTest"})
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
    }
}
