import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SomeTest {

    @Test
    public void firstTest() {



        WebClient client = WebClient.create("http://localhost:8080");
        Mono<ClientResponse> result = client.get()
                .uri("/hello")
                .accept(MediaType.APPLICATION_JSON)
                .exchange();

        System.out.println("First test method");
        System.out.println("First test method");
        System.out.println("First test method");
        System.out.println("First test method");
        System.out.println("First test method");
        System.out.println("First test method");


        String value = result.flatMap(res -> res.bodyToMono(String.class)).block();


            System.err.println("VALUE IS :  ---->>> "  + value);




        }




}


//public class ExampleRouterTest {
//    @Autowired
//    private WebTestClient webTestClient;
//    @Test
//    public void testExampleOneStepFurther() {
//        webTestClient
//                .get().uri("/exampleFurther1")
//                .accept(MediaType.TEXT_PLAIN)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(String.class).isEqualTo("Hello, Spring Webflux Example 1!");
//        webTestClient
//                .get().uri("/exampleFurther2")
//                .accept(MediaType.TEXT_PLAIN)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(String.class).isEqualTo("Hello, Spring Webflux Example 2!");
//    }

