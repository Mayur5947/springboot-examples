package springs_annotaions_bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BikeConfig.class);
		Bike bike = applicationContext.getBean("bike", Bike.class);
		bike.used();
		((AbstractApplicationContext) applicationContext).close();

	}
}
