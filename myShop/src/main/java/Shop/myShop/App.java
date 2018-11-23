package Shop.myShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import myShop.configurations.AppConfiguration2;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = { "Shop.myShop", "Shop.controllerOrder", "Shop.controllerUser",
		"Shop.controllerProduct" })
@Import(AppConfiguration2.class)
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
