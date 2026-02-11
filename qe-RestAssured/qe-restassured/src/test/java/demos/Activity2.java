
package demos;

import static io.restassured.RestAssured.given;
import java.io.File;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import io.restassured.response.Response;


public class Activity2 {

    String baseUrl = "https://petstore.swagger.io/";

    @Test(priority = 1)
    public void addNewUser(){


    File jsonFile = new File("src\\test\\resources\\input.json");

        Response response = given().contentType(ContentType.JSON)
                                       .body(jsonFile)
                                       .when().post(baseUrl+"v2/user");

            response.prettyPrint();

            response.then().statusCode(200);
    }


    @Test(priority = 2)
    public void getUser(){

        Response response = given().contentType(ContentType.JSON)
                                    .pathParam("username", "simha")
                                   .when().get(baseUrl+"v2/user/{username}");

     response.prettyPrint();

            response.then().statusCode(200);
        }

    
        @Test(priority = 3)
        public void deleteUser(){
            Response response = given().contentType(ContentType.JSON).pathParam("username", "simha")
                                                      .when().delete(baseUrl+"v2/user/{username}");
            response.getBody().prettyPrint();

            //getting deleted data
            response = given().contentType(ContentType.JSON)
                                    .pathParam("username", "simha")
                                   .when().get(baseUrl+"v2/user/{username}");

            response.then().statusCode(404);

        }

                                       
}
