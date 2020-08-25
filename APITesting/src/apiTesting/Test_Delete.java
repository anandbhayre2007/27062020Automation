package apiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Test_Delete {

	@Test
	public void test4()
	{
		//End Point
		String endPoint="http://fakerestapi.azurewebsites.net/api/Activities/1";
		
		RestAssured.baseURI=endPoint; //Step 1
		
		RequestSpecification request = RestAssured.given(); // Step 2.
		
		//Add Headers
		//Add Body
		
		Response response = request.request(Method.DELETE);
		
		int statusCode=response.getStatusCode();
		
	    Assert.assertEquals(statusCode, 200);
	    System.out.println(response.asString());
	}
}
