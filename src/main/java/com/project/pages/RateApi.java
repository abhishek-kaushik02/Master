package com.project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jxl.common.Assert;
import net.serenitybdd.core.pages.PageObject;

public class RateApi extends PageObject {

	public void fetchApiDocument() throws InterruptedException{
		getDriver().get("https://www.ecb.europa.eu/stats/policy_and_exchange_rates/euro_reference_exchange_rates/html/index.en.html");
		String pageText = getDriver().findElement(By.xpath("//*[@id='ecb-content-col']/main/h1")).getText();
		System.out.println("Page Text" + pageText);
	}
	
	public void fetchDataOfLatestForigenExchangeRateForUSD(String arg1) throws InterruptedException{
		//String searchQueryApi = "https://api.ratesapi.io/api/latest?symbols=USD";

		JsonNode body = Unirest.get(arg1)
		                        .asJson()
		                        .getBody();
		System.out.println(body);         // gives the full json response
		System.out.println(body.length);  // gives the no of items
	}
	
	public void getSuccessData() throws InterruptedException{
		getDriver().get("https://www.ecb.europa.eu/stats/policy_and_exchange_rates/euro_reference_exchange_rates/html/index.en.html");
		List<WebElement> contacts = getDriver().findElements(By.tagName("tr"));

	    Assert.equals(contacts.size(), body.length);
	}
	
	public void fetchDataOfLatestForigenExchangeRateForGBP(String arg1) throws InterruptedException {
		//String searchQueryApi = "https://api.ratesapi.io/api/latest?symbols=GBP";

				JsonNode body = Unirest.get(arg1)
				                        .asJson()
				                        .getBody();
				System.out.println(body);         // gives the full json response
				System.out.println(body.length);  // gives the no of items
	}
	
	public void fetchDataThroughIncorrectUrl(String arg1) throws InterruptedException{
		//String searchQueryApi = "https://api.ratesapi.io/api/";

				JsonNode body = Unirest.get(arg1)
				                        .asJson()
				                        .getBody();
				System.out.println(body);         // gives the full json response
				System.out.println(body.length);  // gives the no of items
	}
	
	public String getErrorData() throws InterruptedException{
		String errorData = getDriver().findElement(By.xpath("/html/body/pre")).getText();
		return errorData;
	}
	
	public void fetchDataThroughSpecificUrl(String arg1) throws InterruptedException{
		//String searchQueryApi = "https://api.ratesapi.io/api/2010-01-12";

		JsonNode body1 = Unirest.get(arg1)
		                        .asJson()
		                        .getBody();
		System.out.println(body);         // gives the full json response
		System.out.println(body.length);  // gives the no of items
	}
	
	public void getSpecificData() throws InterruptedException {
		getDriver().get("https://www.ecb.europa.eu/stats/policy_and_exchange_rates/euro_reference_exchange_rates/html/index.en.html");
		List<WebElement> contacts1 = getDriver().findElements(By.tagName("pre"));

	    Assert.equals(contacts1.size(), body1.length);
	}

	public void quitBrowser() {
		getDriver().quit();
	}
}
