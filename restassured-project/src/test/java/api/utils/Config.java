
package api.utils;

import io.restassured.RestAssured;

public class Config {
    static {
        // Setting the base URI for API calls
        RestAssured.baseURI = "https://reqres.in/api/";
    }
}
