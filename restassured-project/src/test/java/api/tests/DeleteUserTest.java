package api.tests;

import api.utils.Config;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserTest {

    @Test
    public void testDeleteUser() {
        new Config(); // Ensures the Config static block runs.

        // Sending DELETE request
        Response response = given()
                .delete("/users/2"); // Replace 2 with the user ID

        // to Validate response:
        Assert.assertEquals(response.getStatusCode(), 204, "Status code mismatch!"); // 204 No Content expected

        // Step of printing the response
        System.out.println("User deleted successfully.");
    }
}
