package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UserRegistarion {


    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {

        System.out.println("I am on user registration page");

    }



    @When("I enter following")
    public void i_enter_following(DataTable dataTable) {
        System.out.println("I enter following data: ");

         List<String> data =  dataTable.asList();

        System.out.println("First Name:"+data.get(0));
        System.out.println("Last Name:"+data.get(1));
        System.out.println("contact:"+data.get(2));
        System.out.println("Email:"+data.get(3));

    }
    @Then("user should be added")
    public void user_should_be_added() {

        System.out.println("user should be added");
        Assert.assertEquals("user is not added",true,false);

    }

}
