import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Put {
	@Test
	public void puttest() {
		
		JSONObject request= new JSONObject();
		request.put("name", "Sreekanth");
		request.put("job", "QA");
		System.out.println(request);
		
		given().
		body(request.toJSONString()).
		when().put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}

}
