package nikhil.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/cart")
public class CartServiceController {
	
	@Value("${server.port}")
	private String portNo;
	
	/*
	 * METHOD  : GET
	 * PATH    : /show
	 * OUTPUT  : R.E<String>
	 * URL     : /v1/api/cart/show
	 * INPUT   : RequestHeader(TOKENID)
	 */
	
	
    @GetMapping("/show")
    public ResponseEntity<String> getProduct() {
        return ResponseEntity.ok("Welcome to Cart service Running on ::"+portNo);
    }
}