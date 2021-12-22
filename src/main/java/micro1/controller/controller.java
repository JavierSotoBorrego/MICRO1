package micro1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro1")
public class controller {

	@GetMapping(path="/micro1")
	public String helloWorld() {
		return "Hello micro1";
	}
}
