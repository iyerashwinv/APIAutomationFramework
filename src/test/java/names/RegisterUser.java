package names;

import io.restassured.response.Response;
import org.junit.Test;
import org.testng.Assert;
import utils.RestUtils;

import java.util.HashMap;

public class RegisterUser {

    @Test
    public void userRegistration()
    {
            String endpoint = "https://reqres.in/api/users/2";
            String payload = "{\n" +
            "    \"email\": \"eve.holt@reqres.in\",\n" +
            "    \"password\": \"pistol\"\n" +
            "}";
        Response response = RestUtils.postAction(endpoint, payload, new HashMap<>());
        Assert.assertEquals(response.statusCode(), 201);
    }
}

