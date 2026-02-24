package Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest. Matchers.*;

public class GetAndPost{
	
	public static void Test_03() {

		String baseURI = "https://reqres.in/api";

		given().
		   get("/users").
		then().
//		   statusCode(200).
		   body("data[4].first_name", equalTo("George")).
		   log().all();
		
		

}
	public static void main(String[] args) {
		Test_03(); 
	}
}
