package springs_annotaions_car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainController {
 
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);
		Car car = applicationContext.getBean("car",Car.class);
		car.details();
		((AbstractApplicationContext) applicationContext).close();
	}
}
