package Shop.myShop2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import Shop.myShop2.App;
import myShop.configurations.AppConfiguration2;
import myShop.configurations.AppConfiguration1;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = { "Shop.myShop2", "Shop.controllerOrder", "Shop.controllerUser",
"Shop.controllerProduct" })
@Import(AppConfiguration1.class)
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
