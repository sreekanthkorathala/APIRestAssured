import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class post {
@Test
public void posttest() {
	JSONObject request= new JSONObject();
	request.put("name", "Sreekanth");
	request.put("job", "QA");
	System.out.println(request);
	
	given().
	body(request.toJSONString()).
	when().post("https://reqres.in/api/users").
	then().
	statusCode(201);
	
}
}
