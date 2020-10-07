package net.serenitybdd.cucumber.features;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.features.steps.serenity.Steps;
public class StepDefination {
	

	
	@net.thucydides.core.annotations.Steps
	Steps steps;
	
	
	@Given("^Rates api for latest forigen exchange rate$")
	public void rates_api_for_latest_forigen_exchange_rate() throws Throwable {
	   steps.rates_api_for_latest_forigen_exchange_rate();
	}

	@When("^The Api is availble for \"([^\"]*)\"$")
	public void the_Api_is_availble_for(String arg1) throws Throwable {
	    steps.the_Api_is_availble_for(arg1);
	}

	@Then("^Verify that user is able to fetch data from api successfully$")
	public void verify_that_user_is_able_to_fetch_data_from_api_successfully() throws Throwable {
	   steps.verify_that_user_is_able_to_fetch_data_from_api_successfully();
	}
	
	@When("^The Api is availble for GBP \"([^\"]*)\"$")
	public void the_Api_is_availble_for_GBP(String arg1) throws Throwable {
	    steps.the_Api_is_availble_for_GBP(arg1);
	}
	
	@When("^The Api is availble for incorrect url \"([^\"]*)\"$")
	public void the_Api_is_availble_for_incorrect_url(String arg1) throws Throwable {
	    steps.the_Api_is_availble_for_incorrect_url(arg1);
	}
	
	@Then("^Verify that user should not able to fetch data from api successfully$")
	public void verify_that_user_should_not_able_to_fetch_data_from_api_successfully() throws Throwable {
	    steps.verify_that_user_should_not_able_to_fetch_data_from_api_successfully();
	}


	@Given("^Rates api for Specific date Foreign Exchange rates$")
	public void rates_api_for_Specific_date_Foreign_Exchange_rates() throws Throwable {
	    steps.rates_api_for_Specific_date_Foreign_Exchange_rates();
	}

	@When("^The api is availble for Specific \"([^\"]*)\"$")
	public void the_api_is_availble_for_Specific(String arg1) throws Throwable {
	    steps.the_api_is_availble_for_Specific(arg1);
	}

	@Then("^Verify that user is able to fetch data for Specific date Foreign Exchange rates$")
	public void verify_that_user_is_able_to_fetch_data_for_Specific_date_Foreign_Exchange_rates() throws Throwable {
	    steps.verify_that_user_is_able_to_fetch_data_for_Specific_date_Foreign_Exchange_rates();
	}

}
