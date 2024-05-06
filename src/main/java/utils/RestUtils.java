package utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.Map;

public class RestUtils {

    public static Response postAction(String endpoint, String requestPayload, Map<String,String> headers) {
        return RestAssured.given().log().all()
                        .baseUri(endpoint)
                        .headers(headers)
                        .contentType(ContentType.JSON)
                        .body(requestPayload)
                        .post()
                        .then().log().all().extract().response();
    }
}
