package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import starter.user.GetListUser;

public class ListUserStep {
    @Steps
    GetListUser getListUser;

    @Given("I set GET api endpoints for list user")
    public void setGetApiEndpoints(){
        getListUser.setApiEndpoints();
    }

    @When("I send GET HTTP Request list user")
    public void sendGetHttpRequest(){
        getListUser.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200 list user")
    public void receiveValidHttpResponse(){
        getListUser.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail list user")
    public void receiveValidDataForUser(){
        getListUser.validateDataDetailUser();
    }
}
