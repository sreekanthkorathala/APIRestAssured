import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Delete {
	@Test
	public void deletetest() {
		when().delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();
	}
}
