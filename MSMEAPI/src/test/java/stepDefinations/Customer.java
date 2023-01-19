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

public class Customer extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data = new TestDataBuild();

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) throws IOException {
		res = given().spec(requestSpecification()).header("access_token", Utils.getGlobalValue("token"))
				.body(data.LoginPayload()
				);
		APIResources resourceAPI = APIResources.valueOf(resource);
		response = res.when().post(resourceAPI.getResource());
		System.out.println(response.asPrettyString());
	}

}
