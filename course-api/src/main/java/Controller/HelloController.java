/**
 * 
 */
package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adwiti
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello world";
	}

}
