package demos;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Activity1 {

    String BaseUrl = "https://petstore.swagger.io/";

    @Test(priority = 1)
    public void addNewPet(){

    String reqBody = """
            {
    "id" : 2345431,
    "name": "kittykat",
    "status":"Available"
    }
            """;

    Response response = given().contentType(ContentType.JSON)
                                       .body(reqBody)
                                       .when().post(BaseUrl+"v2/pet");

    response.then().statusCode(200);
    }


    @Test(priority = 2)
    public void getPet(){

        Response response = given().contentType(ContentType.JSON)
                                    .pathParam("petId", 2345431)
                                   .when().get(BaseUrl+"v2/pet/{petId}");

            response.prettyPrint();
            response.then().statusCode(200);

        }

    
        @Test(priority = 3)
        public void deletePet(){
            Response response = given().contentType(ContentType.JSON).pathParam("petId", 2345431)
                                                      .when().delete(BaseUrl+"v2/pet/{petId}");
         

            //asserting with status code 200
            response.then().statusCode(200);
        }                                 
}
