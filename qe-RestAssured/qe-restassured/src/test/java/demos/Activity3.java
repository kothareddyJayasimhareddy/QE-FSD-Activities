
package demos;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
// import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;




public class Activity3 {
    private RequestSpecification reqSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public void setUp(){
        reqSpec = new RequestSpecBuilder()
        .setContentType(ContentType.JSON)
        .setBaseUri("https://petstore.swagger.io/v2/pet")
        .build();


        responseSpec = new ResponseSpecBuilder()
                            .expectStatusCode(200)
                            .expectBody("status", equalTo("alive"))
                            .build();
    }

    // @Test(priority = 0)
    // public void addNewPet(){

    // File pet1File = new File("src\test\resources\petInput.json");
    // File pet2File = new File("src\test\resources\petInput2.json");

    //     Response response = given().spec(reqSpec)
    //                                 .body(pet1File)
    //                                 .when().post();

    //         response.prettyPrint();

    //         response.then().spec(responseSpec);
    // }


   @Test(priority = 0)
    public void addNewPet() throws FileNotFoundException{

    FileInputStream pet1File = new FileInputStream("src\\test\\resources\\pet1&2Input.json");

    JsonPath j = new JsonPath(pet1File);

    int c = j.getList("$").size();

    for(int i =0;i<c;i++){

        Map<String,Object> s = j.getMap("["+i+"]");


        Response response = given().spec(reqSpec)
                                    .body(s)
                                    .when().post();

            response.prettyPrint();

            response.then().spec(responseSpec);
    }
}


    @DataProvider(name = "petInfo")
    public static Object[][] petInfo(){
        return new Object[][] {
                { 98712323,"kitty","alive"}
        };
    }

    @Test(priority = 1, dataProvider = "petInfo")
    public void getPet(Integer id, String name, String status){
        Response response = given().spec(reqSpec)
                                    .pathParam("petId", id)
                                    .when().get("/{petId}");

             response.prettyPrint();

            response.then().spec(responseSpec);
       
    }

    
        @Test(priority = 2, dataProvider = "petInfo")
        public void deleteUser(Integer id, String name, String status){
            Response response = given().spec(reqSpec)
                                      .pathParam("petId", id)
                                      .when().delete("/{petId}");
            response.getBody().prettyPrint();

            //getting deleted data
            response = given().spec(reqSpec)
                                .pathParam("petId", id)
                                .when().get("/{petId}");

            response.then().spec(responseSpec);

        }

                                       
}
