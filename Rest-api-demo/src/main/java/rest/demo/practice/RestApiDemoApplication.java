package rest.demo.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "rest.demo")
public class RestApiDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestApiDemoApplication.class);
    }

}
