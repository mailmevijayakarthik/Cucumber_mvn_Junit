package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MySampleStepdefs extends BaseStepDef{
	int x , y, z;
	
	
	@Given("running the first step")
	public void running_the_first_step() {
	    x = 5;
	}

	@Given("running {int}nd step")
	public void running_nd_step(Integer int1) {
	    y =6;
	}

	@When("adding first and second for the third step")
	public void adding_first_and_second_for_the_third_step() {
	    z= x +y ;
	}

	@Then("verify the total is sum of first two")
	public void verify_the_total_is_sum_of_first_two() {
	   System.out.println("The final value is "+ z);
	}
	
	@Given("Launching  {string} in {string} browsers")
	public void launching_in_browsers(String url, String browser) {
	    driver=createDriver(browser);
		driver.get(url);
	}
	
	@When("user logins in the application using prodtesting{int}@gmail.com,Automation@{int}")
	public void user_logins_in_the_application_using_prodtesting_gmail_com_Automation(String username, String password) {
	  
	}
}
