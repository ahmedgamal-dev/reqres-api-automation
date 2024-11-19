package api.tests;

import api.models.User;
import api.utils.Config;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateUserTest {

    @Test
    public void testUpdateUser() {
        new Config(); // Ensures the Config static block runs.

        // Prepare updated data
        User updatedUser = new User("Jane Doe", "Product Manager");

        // Sending "put" request to update user
        Response response = given()
                .header("Content-Type", "application/json")
                .body(updatedUser)
                .put("/users/2"); // Replace 2 with the user ID

        // to Validate response:
        Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatch!");
        Assert.assertEquals(response.jsonPath().getString("name"), updatedUser.getName(), "Name mismatch!");
        Assert.assertEquals(response.jsonPath().getString("job"), updatedUser.getJob(), "Job mismatch!");

        // Step of printing the response
        System.out.println("Response: " + response.asString());
    }
}
