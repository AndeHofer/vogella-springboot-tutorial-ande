package at.ande.vogella.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ande
 * @since (December 2021)
 */
@RestController
public class HelloWorldcontroller {
	
	@RequestMapping("/")
	String index() {
		return "Hello, Ande!";
	}

}
