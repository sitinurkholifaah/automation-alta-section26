package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetListUser {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints for list user")
    public String setApiEndpoints() {
        return url + "users?page=2";
    }

    @Step("I send GET HTTP Request list user")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid HTTP response code 200 list user")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail list user")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("'page'", equalTo(2)));
    }
}
