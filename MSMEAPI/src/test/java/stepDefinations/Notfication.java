package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

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

public class Notfication extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();

	
	@Then("the API call is sucess with status code {int}")
	public void the_api_call_is_sucess_with_status_code(Integer statusCode) {
		assertEquals(response.getStatusCode(), 200);

	}

	@Then("the API call is sucess with errormsg and status code {int}")
	public void the_api_call_is_sucess_with_errormsg_and_statusCode(Integer statusCode) {
		assertEquals(response.getStatusCode(), 400);

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String ExpectedValue) {

		String Datetime = getJsonPath(response, "Datetime");
		System.out.println(Datetime);
		assertNotNull(Datetime);

	}

	@Then("errorMsg in response body is {string}")
	public void error_msg_in_response_body_is(String errorMsg) {
		String Error = getJsonPath(response, "Error");
		System.out.println(Error);
		assertNotNull(Error);
		assertEquals(Error, errorMsg);

	}

	@When("user calls {string} with {string} http request with {string}")
	public void user_calls_with_http_request_with(String resource, String method, String phoneno) throws IOException {

		res = given().spec(requestSpecification()).body(data.notoficationRegistrationSmsPayload(phoneno));
		APIResources resourceAPI = APIResources.valueOf(resource);
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = res.when().post(resourceAPI.getResource());
		System.out.println(response.asPrettyString());

	}

	@Then("^the API call is success with status code 200$")
	public void the_api_call_is_sucess_with_status_code_200() throws Throwable {

	}

	@And("^\"([^\"]*)\" is there in response body $")
	public void something_is_there_in_response_body(String strArg1) throws Throwable {

	}

	@And("^validate the payload structure$")
	public void validate_the_payload_structure() throws Throwable {

	}

	@And("^validate the response time is less than 500 ms$")
	public void validate_the_response_time_is_less_than_500_ms() throws Throwable {

	}

}
