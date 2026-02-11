
package demos;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class getNewPet {
        String baseUrl = "https://petstore.swagger.io/v2";

    @Test
    public void newPet(){

                Response response = given().contentType(ContentType.JSON)
                .pathParam("petId", 98712323)
                .when().post(baseUrl+"/pet/{petId}");

                System.out.println(response.getBody().asPrettyString());
    }
}
