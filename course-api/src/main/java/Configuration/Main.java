/**
 * 
 */
package Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Adwiti
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = { "Controller" })
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
