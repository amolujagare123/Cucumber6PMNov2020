package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@login")
    public void beforeScenario()
    {
        System.out.println("===== @Before ====");
    }

    @After("@login")
    public void afterScenario()
    {
        System.out.println("===== @After ====");
    }

    @Before("@userRegistration")
    public void beforeScenario2()
    {
        System.out.println("===== @Before ====");
    }

}
