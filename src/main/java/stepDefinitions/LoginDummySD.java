package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDummySD {

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");

    }



    @When("I enter username as admin and password as admin")
    public void i_enter_username_as_admin_and_password_as_admin() {
        System.out.println("I enter username as admin and password as admin");


    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

          }

    @Then("I should land up to the home page")
    public void i_should_land_up_to_the_home_page() {
        System.out.println("I should land up to the home page");

    }


   @When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as_something_and_password_as_something(String user, String pass)
            {
                System.out.println("username:"+user);
                System.out.println("password:"+pass);

    }

   /* @When("I enter username as {string} and password as {string}")
    public void i_enter_username_as_and_password_as(String username, String password) {

        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }*/

    @When("^We enter username as (.+) and password as (.+)$")
    public void we_enter_username_as_and_password_as(String username, String password) throws Throwable {
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }

    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {
        System.out.println("---------------I open browser---------------");
    }


    @When("^I maximize browser$")
    public void i_maximize_browser() throws Throwable {
        System.out.println("---------------I maximize browser---------------");
    }
}
