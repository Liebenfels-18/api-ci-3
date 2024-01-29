import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class PostmanEchoTest {
    @Test
    void shouldReturnCorrectRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("work")
        .when()
                .post("/post")
        .then()
                .statusCode(200)
                .body("data", equalTo("not work"))
        ;
    }

}
