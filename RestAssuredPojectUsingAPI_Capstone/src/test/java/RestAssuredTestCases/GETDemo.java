package RestAssuredTestCases;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETDemo {

	public static void main(String[] args) {
	
		Response resp=given().
				when()
				.get("https://reqres.in/api/users?page=2");
		        
		System.out.println(resp.asString());
		String firstname=resp.jsonPath().getString("data.first_name[3]");
		String id=resp.jsonPath().getString("data.id[3]");
		System.out.println("The first name is: " +firstname);
		System.out.println("The id is: " +id);
       System.out.println("the status response code is :"+resp.getStatusCode()); 
		 
		
 
        
	}

}
