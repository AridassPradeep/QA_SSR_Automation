package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class Cart extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();

	@Given("user calls {string} with {string} http request for {string}")
	public void user_calls_something_with_something_http_request_for_something(String resource, String method,
			String payloadBody) throws Throwable {

		if (method.equalsIgnoreCase("Post")) {
			res = given().spec(requestSpecification()).header("access_token", Utils.getGlobalValue("token"))
					.contentType(ContentType.JSON).body(Utils.getJsonData(payloadBody));
			APIResources resourceAPI = APIResources.valueOf(resource);
			response = res.when().post(resourceAPI.getResource());

		} else if (method.equalsIgnoreCase("Get")) {

			res = given().spec(requestSpecification()).header("access_token", Utils.getGlobalValue("token"));
			APIResources resourceAPI = APIResources.valueOf(resource);
			response = res.when().get(resourceAPI.getResource());

		}
		System.out.println(response.asPrettyString());
	}

	@Then("^validate that the \"([^\"]*)\"  call response is success with status code \"([^\"]*)\"$")
	public void validate_that_the_something_call_response_is_success_with_status_code_something(String strArg1,
			String responseCode) throws Throwable {
		assertEquals(response.getStatusCode(), Integer.parseInt(responseCode));
	}

	@And("^validate the \"([^\"]*)\" response time is less than \"([^\"]*)\" ms$")
	public void validate_the_something_response_time_is_less_than_something_ms(String strArg1, String expectedTime)
			throws Throwable {
		int time = Long.valueOf(response.getTime()).intValue();
		System.out.println("time" + time);
		assert time < Integer.decode(expectedTime);
	}

	@And("^validate the \"([^\"]*)\" payload structure has \"([^\"]*)\"$")
	public void validate_the_something_payload_structure_has_something(String strArg1, String validationKeyword)
			throws Throwable {
		assertThat(response.asPrettyString(), containsString(validationKeyword));

	}

}
