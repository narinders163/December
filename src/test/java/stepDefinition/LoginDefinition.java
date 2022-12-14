package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	
	@Given("i am on the login page")
	public void i_am_on_the_login_page() {
	   
	}

	@When("i enter the following details in the username and password fields")
	public void i_enter_the_following_details_in_the_username_and_password_fields(DataTable dataTable) {
	  List<List<String>> asLists = dataTable.asLists(String.class);
	}

	@Then("I verify the login success")
	public void i_verify_the_login_success() {
	  
	}


}
