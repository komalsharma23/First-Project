package Com.oodlefinance.komal.sharma.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestContoller
public class InternalMicroservice {

	//public static void main(String[] args) {
		//SpringApplication.run(InternalMicroservice.class, args);
	@RequestMapping("/hello")
	public string Test()
	return "Hello World";
	}

}
