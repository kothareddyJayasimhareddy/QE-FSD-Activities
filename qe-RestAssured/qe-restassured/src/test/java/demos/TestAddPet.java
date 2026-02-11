// package demos;

// import org.testng.annotations.Test;

// import io.restassured.http.ContentType;
// import io.restassured.response.Response;

// import static io.restassured.RestAssured.given;

// public class TestAddPet {
//     // String baseUrl = "https://petstore.swagger.io/v2";
//         String baseUrl = "https://petstore.swagger.io/v2";


//     @Test
//     public void addNewPet(){
//         String reqBody = """
//                 {
//         "id": 98712323,
//         "name": "kitty",
//         "status":"available"
//                         }
//                 """;

//                 // Response response = given().contentType(ContentType.JSON)
//                 // .body(reqBody).when().post(baseUrl+"/pet");

                 

//                 System.out.println(response.asPrettyString());

//                 // response.getBody().prettyPrint();

//                 response.then().statusCode(200);
//     }
// }
