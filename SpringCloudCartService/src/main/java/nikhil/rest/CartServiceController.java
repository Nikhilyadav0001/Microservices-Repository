package nikhil.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nikhil.response.Cart;

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
    public ResponseEntity<String> getCartDetails() {
        return ResponseEntity.ok("Welcome to Cart service Running on ::"+portNo);
    }
    
    /*
	 * METHOD  : GET
	 * PATH    : /find
	 * OUTPUT  : R.E<Cart>
	 * INPUT   : id (@Pathvariable)
	 * URL     : /v1/api/cart/find/{id}
	 * 
	 */
	
	@GetMapping("/find/{id}")
	public ResponseEntity<String> getCartById(
				@PathVariable Integer id) {
		Cart cart = new Cart();
		cart.setCartId(id);
		cart.setCartCost(32000.0);
		cart.setCartCode("TEST");
		
		return ResponseEntity.ok(cart.toString()+"PORT OF CART:: "+portNo);
	}
	
	/*
	 * METHOD  : POST
	 * PATH    : /create
	 * OUTPUT  : R.E<String>
	 * INPUT   : Cart (@Requestbody)
	 * URL     : /v1/api/cart/create
	 * 
	 */
	@PostMapping("/create")
	public ResponseEntity<String> addToCart(
			@RequestBody Cart cart) {
		return ResponseEntity.ok("ADDED TO CART => " + cart);
	}
    
    
}