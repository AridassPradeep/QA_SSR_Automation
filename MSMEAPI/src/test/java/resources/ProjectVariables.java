package resources;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;

public class ProjectVariables {
    public static RequestSpecification res;
    public static  ResponseSpecification resspec;
    public static String orderNum ;
    public static Response response;
    public static  TestDataBuild data = new TestDataBuild();
}