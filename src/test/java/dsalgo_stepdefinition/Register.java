package dsalgo_stepdefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
		
	WebDriver driver;
		@Given("The user is on the DS Algo Sign in Page")
		public void the_user_is_on_the_ds_algo_sign_in_page() {
		    System.out.println("User is in login page");
		   		}
		@When("The user clicks login button after entering the {string} and leaves {string} textbox blank")
		public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_blank(String string, String string2) {
			System.out.println("Leaving Username and Password blank");
		}
		@Then("The error message {string} appears below Pwd textbox")
		public void the_error_message_appears_below_pwd_textbox(String string) {
			System.out.println("Please enter UserName and Password");
			
		}
		
		@When("The user clicks login button after leaving the {string} textbox and {string} textbox blank")
		public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_blank(String Username, String Password) {
		    
			System.out.println(Username +" and Password is:" +Password);
		}
		@Then("The error message {string} appears below Username textbox")
		public void the_error_message_appears_below_username_textbox(String string) {
			System.out.println("Please enter Password");
			
		}

	}

