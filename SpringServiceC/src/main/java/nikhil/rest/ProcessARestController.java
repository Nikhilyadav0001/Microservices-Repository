package nikhil.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/C")
public class ProcessARestController {

	@GetMapping("/showC")
	public String showMsg() {
		
		return "FROM C..";
	}
}