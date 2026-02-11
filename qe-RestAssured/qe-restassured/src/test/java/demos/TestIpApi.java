
package demos;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class TestIpApi {
        String baseUrl = "https://petstore.swagger.io/v2";

    @Test
    public void getIpInformation(){


        Response response = given().contentType(ContentType.JSON)
                                  .when().post(baseUrl+"/pet/{petId}");
                 

         System.out.println(response.getBody().asPrettyString()+"hi");
    }
}
