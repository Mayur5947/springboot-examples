package springs_annotaions_employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		Employee employee = applicationContext.getBean("employee", Employee.class);
		employee.check();
	}
}
