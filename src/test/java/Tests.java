import org.devilengine.App;
import org.devilengine.controller.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = {App.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Tests {

    @Autowired
    private Controller controller;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    void testOk() {

        assertThat(this.testRestTemplate.getForObject("http://localhost:" + port + "/api/v1/ok",
                String.class)).contains("OK");
    }
}