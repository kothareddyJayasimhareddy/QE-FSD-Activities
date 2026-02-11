
package demos;

import static io.restassured.RestAssured.given;
import java.io.File;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class demo {
    private RequestSpecification reqSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public void setUp(){
        reqSpec = new RequestSpecBuilder()
        .setContentType(ContentType.JSON)
        .setBaseUri("https://petstore.swagger.io/v2/user")
        .build();


        responseSpec = new ResponseSpecBuilder()
                            .expectStatusCode(200)
                            .build();
    }

    @Test(priority = 1)
    public void addNewUser(){

    File jsonFile = new File("src\\test\\resources\\input.json");

        Response response = given().spec(reqSpec)
                                    .body(jsonFile)
                                    .when().post();

            response.prettyPrint();

            response.then().spec(responseSpec);
    }


    @Test(priority = 2)
    public void getUser(){

        Response response = given().spec(reqSpec)
                                    .pathParam("username", "simha")
                                   .when().get("/{username}");

     response.prettyPrint();

            response.then().spec(responseSpec);
        }

    
        @Test(priority = 3)
        public void deleteUser(){
            Response response = given().spec(reqSpec)
                                      .pathParam("username", "simha")
                                        .when().delete("/{username}");
            response.getBody().prettyPrint();

            //getting deleted data
            response = given().spec(reqSpec)
                                .pathParam("username", "simha")
                                .when().get("/{usernem}");

            response.then().spec(responseSpec);

        }

                                       
}
