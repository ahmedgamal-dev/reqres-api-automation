package api.tests;

import api.utils.Config;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserTest {

    @Test
    public void testGetUserDetails() {
        new Config(); // Ensures the Config static block runs.

        // Send "GET" request to fetch user details
        Response response = given()
                .get("/users/2"); // Replace 2 with the user ID

        // to Validate response:
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");
        Assert.assertNotNull(response.jsonPath().getString("data.id"), "User ID is null!");
        Assert.assertNotNull(response.jsonPath().getString("data.email"), "User email is null!");

        // Step of printing the response
        System.out.println("Response: " + response.asString());
    }
}
