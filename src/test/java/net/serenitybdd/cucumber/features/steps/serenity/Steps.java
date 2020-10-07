package net.serenitybdd.cucumber.features.steps.serenity;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;


import com.project.pages.RateApi;


import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	RateApi rateApi;
	
	@After
	public void closeBrowser(){
		rateApi.quitBrowser();
	}

	
	
	@Step
	public void home_page_is_displayed() throws Throwable {	

	}
	
	@Step
	public void rates_api_for_latest_forigen_exchange_rate() throws Throwable {
	   rateApi.open();
	   rateApi.fetchApiDocument();
	}

	@Step
	public void the_Api_is_availble_for(String arg1) throws Throwable {
	    rateApi.fetchDataOfLatestForigenExchangeRateForUSD(arg1);
	}

	@Step
	public void verify_that_user_is_able_to_fetch_data_from_api_successfully() throws Throwable {
	   rateApi.getSuccessData();
	}
	
	@Step
	public void the_Api_is_availble_for_GBP(String arg1) throws Throwable {
	    rateApi.fetchDataOfLatestForigenExchangeRateForGBP(arg1);
	}
	
	@Step
	public void the_Api_is_availble_for_incorrect_url(String arg1) throws Throwable {
	    rateApi.fetchDataThroughIncorrectUrl(arg1);
	}

	@Step
	public void verify_that_user_should_not_able_to_fetch_data_from_api_successfully() throws Throwable {
	    rateApi.getErrorData();
	    Assert.assertEquals("error", rateApi.getErrorData());
	}
	
	@Step
	public void rates_api_for_Specific_date_Foreign_Exchange_rates() throws Throwable {
		rateApi.fetchApiDocument();
	}
	
	@Step
	public void the_api_is_availble_for_Specific(String arg1) throws Throwable {
	    rateApi.fetchDataThroughSpecificUrl(arg1);
	}
	
	@Step
	public void verify_that_user_is_able_to_fetch_data_for_Specific_date_Foreign_Exchange_rates() throws Throwable {
	    rateApi.getSpecificData();
	 
	}
}
