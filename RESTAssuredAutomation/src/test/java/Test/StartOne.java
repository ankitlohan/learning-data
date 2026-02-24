package Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class StartOne {


	public static void Test_01() {

		Response response =	get("https://reqres.in/api/users/2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.statusLine());
		System.out.println(response.getHeader("content-type"));

		//		int code = response.getStatusCode();
		//		Assert.assertEquals(response.getStatusCode(), 200);
	}

	public static void Test_02() {

		baseURI = "https://reqres.in/api";

		given().
		   get("/users/2").
		then().
		   statusCode(200).
		   log().all();
	}

	public static void main(String[] args) {
		Test_02();

}
}