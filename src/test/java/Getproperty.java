import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class Getproperty {
	@Test
	public void testp() {
		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		
		body("data.first_name",hasItems("Michael","Lindsay"))
		.log().all();	
	}

}
