package nikhil.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/api/B")
public class ProcessARestController {
	

	@Autowired
	private RestTemplate rt;


	@GetMapping("/showB")
	public String showMsg() {
		
		String resp = rt.getForEntity("http://localhost:8084/v1/api/C/showC", String.class).getBody();

		return "FROM B.." + resp;
	}
}