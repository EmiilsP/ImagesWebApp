package Images_WebApp.Images_WebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class ImagesWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImagesWebAppApplication.class, args);
	}


}
