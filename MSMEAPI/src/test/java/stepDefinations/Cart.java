package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import org.hamcrest.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class Cart extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();

	@Given("user calls {string} with {string} http request for {string}")
	public void user_calls_something_with_something_http_request_for_something(String resource, String method,
			String payloadBody) throws Throwable {
		res = given().spec(requestSpecification()).header("access_token", Utils.getGlobalValue("token"))
				.contentType(ContentType.JSON).body(Utils.getJsonData(payloadBody));
		APIResources resourceAPI = APIResources.valueOf(resource);
		response = res.when().post(resourceAPI.getResource());
		System.out.println(response.asPrettyString());
	}

	@Then("^validate the \"([^\"]*)\"  call response is success with status code 200$")
	public void validate_the_something_call_response_is_success_with_status_code_200(String strArg1) throws Throwable {
		assertEquals(response.getStatusCode(), 200);
	}

	@And("^validate the \"([^\"]*)\" response time is less than \"([^\"]*)\" ms$")
	public void validate_the_something_response_time_is_less_than_something_ms(String strArg1, String expectedTime)
			throws Throwable {
		int time = Long.valueOf(response.getTime()).intValue();
		System.out.println("time" + time);
		assert time < Integer.decode(expectedTime);
	}

	@And("^validate the \"([^\"]*)\" payload structure has \"([^\"]*)\"$")
	public void validate_the_something_payload_structure_has_something(String strArg1, String strArg2)
			throws Throwable {

	}

}