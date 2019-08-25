package vijay.kubernetes.test.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		System.out.println("Hello Kubernetes Versino 2 -----upgraded---DCOKE AUTOMATED");
	}

		@GetMapping
		public String hello()
		{
			return "HELLO FROM KUBERNETERs***************WITH DOCKER HUB PUSH AUTOATED************>>>>>";
		}
	
}
