package CucumberTest.CucumberTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class App 
{
	int responseCode;
	HttpURLConnection connection;
    public static void main( String[] args )
    {
        System.out.println( "" );
    }
    
    @Given("Rates API for Latest Foreign Exchange rates")
    public void rates_API_for_Latest_Foreign_Exchange_rates() {
		System.out.println("Rates API for Latest Foreign Exchange rates");
    }
    
    @When("The API is available for url {string}")
    public void the_API_is_available_for_url(String url)  throws MalformedURLException, IOException{
    	connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("GET");
		responseCode = connection.getResponseCode();
	}

	@Then("I assert the success status of the response")
    public void i_assert_the_success_status_of_the_response() throws IOException {
		
		if(responseCode==200 && !connection.getResponseMessage().equals("Not Found"))
		{
			System.out.println("Page loaded successfully with status : " + connection.getResponseMessage());
		}
		else
		{
			System.err.println("Page returned some error status: " + connection.getResponseMessage());
		}
    }
	
	@Then("I assert the response supplied by the call")
	public void i_assert_the_response_supplied_by_the_call() throws IOException {
		if(responseCode==400 && connection.getResponseMessage().equals("Bad Request"))
		{
			System.err.println("An incorrect or incomplete url is provided : " + connection.getResponseMessage());
		}
		else
		{
			System.out.println("URL is correct : " + connection.getResponseMessage());
		}
	}
	
	@Given("Rates API for Specific date Foreign Exchange rates")
	public void rates_API_for_Specific_date_Foreign_Exchange_rates() {
		System.out.println("Rates API for Specific date Foreign Exchange rates");
	}
}
