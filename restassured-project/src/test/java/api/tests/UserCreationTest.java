package api.tests;
import api.utils.Config;
import api.models.User;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class UserCreationTest {

    @Test
    public void testCreateUser() {
        new Config(); // Ensures the Config static block runs.

        // first off preparing user data
        User user = new User("John Doe", "Software Engineer");

        // Send POST request
        Response response = given()
                .header("Content-Type", "application/json") // Set Content-Type header
                .body(user) // passing the user object, and it will automatically be serialized to JSON
                .post("/users"); // Endpoint for user creation

        // to Validate response status code
        Assert.assertEquals(response.getStatusCode(), 201, "Status code mismatch!");

        // here is we can Validate response body
        Assert.assertNotNull(response.jsonPath().getString("id"), "ID is null!"); // Check ID is present
        Assert.assertEquals(response.jsonPath().getString("name"), user.getName(), "Name mismatch!");
        Assert.assertEquals(response.jsonPath().getString("job"), user.getJob(), "Job mismatch!");

        // Print the response (optional for debugging)
        System.out.println("Response: " + response.asString());
    }
}
