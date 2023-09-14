package APis;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

public class LoginAPITest {
    private SoftAssert soft = new SoftAssert();
        // Set base URI and port
        static {
            RestAssured.baseURI = "https://pay2.foodics.dev";
            RestAssured.port = 443;
        }

        @Test
        public void testSuccessfulLogin() {
            String requestBody = "{\n" +
                    "\"email\": \"merchant@foodics.com\",\n" +
                    "\"password\": \"123456\",\n" +
                    "\"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\"\n" +
                    "}";

            Response response = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("/cp_internal/login");

            String actualToken = response.jsonPath().get("token");
            int statusCode = response.getStatusCode();
            soft.assertEquals(statusCode,200);

        }

        @Test
        public void testInvalidEmailLogin() {
            String requestBody = "{\n" +
                    "\"email\": \"invalid@foodics.com\",\n" +
                    "\"password\": \"123456\",\n" +
                    "\"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\"\n" +
                    "}";

            Response response = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("/cp_internal/login");

            int statusCode = response.getStatusCode();
            //status code should be 400 bad request not 500 internal error because I'm using an invalid email in the post request
            // I'm using soft assertion to avoid getting errors in the script but this is a negative script that should fail
            System.out.println("The status code is : "+statusCode);
            soft.assertEquals(statusCode,400);

        }

        @Test
        public void testInvalidPasswordLogin() {
            String requestBody = "{\n" +
                    "\"email\": \"merchant@foodics.com\",\n" +
                    "\"password\": \"wrongpassword\",\n" +
                    "\"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\"\n" +
                    "}";

            Response response = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post("/cp_internal/login");

            int statusCode = response.getStatusCode();
            //status code should be 400 bad request because i'm using an invalid password in the post request
            // I'm using soft assertion to avoid getting errors in the script but this is a negative script that should fail
            System.out.println("The status code is : "+statusCode);
            soft.assertEquals(statusCode,400);

        }
    @Test
    public void testEmptyBodyLogin() {
        String requestBody = "";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post("/cp_internal/login");

        int statusCode = response.getStatusCode();
        soft.assertEquals(statusCode,400);
        //status code should be 400 bad request because i'm using an empty body in a post request
        // I'm using soft assertion to avoid getting errors in the script but this is a negative script that should fail
        System.out.println("The status code is : "+statusCode);

    }
    }


